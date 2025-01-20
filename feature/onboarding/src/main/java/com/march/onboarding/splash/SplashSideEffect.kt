package com.march.onboarding.splash

import androidx.annotation.StringRes

sealed class SplashSideEffect {
    data object NavigateToMain : SplashSideEffect()
    data object NavigateToMeasure : SplashSideEffect()
    data class ShowToast(@StringRes val messageId: Int) : SplashSideEffect()
}