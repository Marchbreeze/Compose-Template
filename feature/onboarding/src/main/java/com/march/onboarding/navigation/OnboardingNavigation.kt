package com.march.onboarding.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.march.navigation.OnboardingRoute
import com.march.onboarding.measure.MeasureRoute
import com.march.onboarding.splash.SplashRoute

fun NavController.navigateToSplash(
    navOptions: NavOptions? = null
) {
    navigate(OnboardingRoute.Splash, navOptions)
}

fun NavController.navigateToMeasure(
    navOptions: NavOptions? = null
) {
    navigate(OnboardingRoute.Measure, navOptions)
}

fun NavGraphBuilder.onboardingNavGraph(
    paddingValues: PaddingValues,
    navigateToHome: () -> Unit,
    navigateToMeasure: () -> Unit,
) {
    composable<OnboardingRoute.Splash> {
        SplashRoute(
            navigateToMain = navigateToHome,
            navigateToMeasure = navigateToMeasure
        )
    }
    composable<OnboardingRoute.Measure> {
        MeasureRoute(paddingValues)
    }
}
