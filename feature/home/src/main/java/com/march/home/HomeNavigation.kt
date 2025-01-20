package com.march.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.march.navigation.MainTabRoute

fun NavController.navigateToHome(
    navOptions: NavOptions? = null
) {
    navigate(MainTabRoute.Home, navOptions)
}

fun NavGraphBuilder.profileNavGraph(
) {
    composable<MainTabRoute.Home> {
        HomeRoute()
    }
}
