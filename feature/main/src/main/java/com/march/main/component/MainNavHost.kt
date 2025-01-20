package com.march.main.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.march.home.homeNavGraph
import com.march.main.navigation.MainNavigator
import com.march.onboarding.navigation.onboardingNavGraph
import com.march.profile.profileNavGraph

@Composable
internal fun MainNavHost(
    paddingValues: PaddingValues,
    navigator: MainNavigator,
    modifier: Modifier = Modifier,
) {
    NavHost(
        modifier = modifier,
        startDestination = navigator.startDestination,
        navController = navigator.navController,
    ) {
        onboardingNavGraph(
            paddingValues = paddingValues,
            navigateToHome = navigator::navigateToHome,
            navigateToMeasure = navigator::navigateToMeasure
        )
        homeNavGraph(paddingValues)
        profileNavGraph(paddingValues)
    }
}