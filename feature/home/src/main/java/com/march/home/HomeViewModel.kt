package com.march.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.march.domain.repository.StudyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val studyRepository: StudyRepository,
) : ViewModel() {

    init {
        getHomeworkList()
    }

    private fun getHomeworkList() {
        viewModelScope.launch {
            studyRepository.getHomeworks(0, 1000)
                .onSuccess {
                    Timber.tag("okhttp").d(it.items.toString())
                }.onFailure {
                    Timber.tag("okhttp").d(it)
                }
        }
    }
}