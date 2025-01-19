package com.march.navigation

import kotlinx.serialization.Serializable

interface OnboardingRoute : Route {
    @Serializable
    data object Splash : OnboardingRoute

    @Serializable
    data object Measure : OnboardingRoute
}
