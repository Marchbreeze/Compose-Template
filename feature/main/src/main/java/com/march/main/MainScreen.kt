package com.march.main

import androidx.compose.foundation.background
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.march.designsystem.theme.White
import com.march.main.component.MainBottomBar
import com.march.main.component.MainNavHost
import com.march.main.navigation.MainNavigator
import com.march.main.navigation.MainTab
import com.march.main.navigation.rememberMainNavigator
import kotlinx.collections.immutable.toImmutableList

@Composable
internal fun MainScreen(
    navigator: MainNavigator = rememberMainNavigator(),
) {
    Scaffold(
        bottomBar = {
            MainBottomBar(
                visible = navigator.shouldShowBottomBar(),
                tabs = MainTab.entries.toImmutableList(),
                currentTab = navigator.currentTab,
                onTabSelected = navigator::navigate
            )
        },
        content = { paddingValues ->
            MainNavHost(
                paddingValues = paddingValues,
                navigator = navigator,
                modifier = Modifier.background(White)
            )
        }
    )
}
