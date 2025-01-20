package com.march.onboarding.splash

sealed class SplashIntent {
    data object Init : SplashIntent()
    data object OnCheckSuccess : SplashIntent()
}