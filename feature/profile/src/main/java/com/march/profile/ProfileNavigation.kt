package com.march.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.march.navigation.MainTabRoute

fun NavController.navigateToProfile(
    navOptions: NavOptions? = null
) {
    navigate(MainTabRoute.Profile, navOptions)
}

fun NavGraphBuilder.profileNavGraph(
) {
    composable<MainTabRoute.Profile> {
        ProfileRoute()
    }
}
