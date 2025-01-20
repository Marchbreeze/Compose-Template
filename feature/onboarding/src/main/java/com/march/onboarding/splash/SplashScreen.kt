package com.march.onboarding.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.march.designsystem.theme.Purple10
import com.march.designsystem.theme.StempoTheme

@Composable
fun SplashRoute(
    navigateToMain: () -> Unit,
    navigateToMeasure: () -> Unit,
    viewModel: SplashViewModel = hiltViewModel(),
) {
    LaunchedEffect(Unit) {
        viewModel.onIntent(SplashIntent.Init)
    }

    LaunchedEffect(Unit) {
        viewModel.sideEffect.collect { sideEffect ->
            when (sideEffect) {
                is SplashSideEffect.NavigateToMain -> navigateToMain()
                is SplashSideEffect.NavigateToMeasure -> navigateToMeasure()
                is SplashSideEffect.ShowToast -> {
                    // TODO
                }
            }
        }
    }

    SplashScreen()
}

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple10),
        contentAlignment = Center
    ) {
        Text("STEMPO", style = StempoTheme.typography.head1)
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    StempoTheme {
        SplashScreen()
    }
}