package com.march.onboarding.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.march.designsystem.theme.Purple10
import com.march.designsystem.theme.StempoTheme

@Composable
fun SplashRoute(
    paddingValues: PaddingValues
) {
    SplashScreen(paddingValues)
}

@Composable
fun SplashScreen(
    paddingValues: PaddingValues = PaddingValues()
) {
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