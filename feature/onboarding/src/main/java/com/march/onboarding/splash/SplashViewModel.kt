package com.march.onboarding.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
) : ViewModel() {

    private val _sideEffect = MutableSharedFlow<SplashSideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    fun onIntent(intent: SplashIntent) {
        when (intent) {
            is SplashIntent.Init -> handleInit()
            is SplashIntent.OnCheckSuccess -> handleCheckSuccess()
        }
    }

    private fun handleInit() {
        checkUserSignedUp()
    }

    private fun checkUserSignedUp() {
        viewModelScope.launch {
            delay(2000)
            onIntent(SplashIntent.OnCheckSuccess)
        }
    }

    private fun handleCheckSuccess() {
        viewModelScope.launch {
            _sideEffect.emit(SplashSideEffect.NavigateToMain)
        }
    }
}