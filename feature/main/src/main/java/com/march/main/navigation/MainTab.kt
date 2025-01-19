package com.march.main.navigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import com.march.feature.main.R
import com.march.navigation.MainTabRoute
import com.march.navigation.Route

enum class MainTab(
    val title: String,
    @DrawableRes val selectedIconResource: Int,
    @DrawableRes val unselectedIconResource: Int,
    val route: MainTabRoute,
) {
    HOME(
        "과제",
        R.drawable.ic_study_selected,
        R.drawable.ic_study_unselected,
        MainTabRoute.Home
    ),
    PROFILE(
        "마이",
        R.drawable.ic_my_selected,
        R.drawable.ic_my_unselected,
        MainTabRoute.Profile
    );

    companion object {
        @Composable
        fun find(predicate: @Composable (MainTabRoute) -> Boolean): MainTab? {
            return entries.find { predicate(it.route) }
        }

        @Composable
        fun contains(predicate: @Composable (Route) -> Boolean): Boolean {
            return entries.map { it.route }.any { predicate(it) }
        }
    }
}
