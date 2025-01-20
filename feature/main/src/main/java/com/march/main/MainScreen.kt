package com.march.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.march.designsystem.theme.White
import com.march.home.homeNavGraph
import com.march.main.component.MainBottomBar
import com.march.main.navigation.MainNavigator
import com.march.main.navigation.MainTab
import com.march.main.navigation.rememberMainNavigator
import com.march.onboarding.navigation.onboardingNavGraph
import com.march.profile.profileNavGraph
import kotlinx.collections.immutable.toImmutableList

@Composable
fun MainScreen(
    navigator: MainNavigator = rememberMainNavigator(),
) {
    Scaffold(
        bottomBar = {
            MainBottomBar(
                visible = navigator.shouldShowBottomBar(),
                tabs = MainTab.entries.toImmutableList(),
                currentTab = navigator.currentTab,
                onTabSelected = { tab ->
                    navigator.navigate(tab)
                }
            )
        },
        content = { paddingValue ->
            NavHost(
                modifier = Modifier
                    .padding(paddingValue)
                    .background(White),
                startDestination = navigator.startDestination,
                navController = navigator.navController,
            ) {
                onboardingNavGraph()
                homeNavGraph()
                profileNavGraph()
            }
        }
    )
}
