package com.march.navigation

import kotlinx.serialization.Serializable

interface MainTabRoute : Route {
    @Serializable
    data object Home : MainTabRoute

    @Serializable
    data object Profile : MainTabRoute
}
