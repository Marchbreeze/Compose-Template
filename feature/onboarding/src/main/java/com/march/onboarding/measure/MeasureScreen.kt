package com.march.onboarding.measure

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.march.designsystem.theme.StempoTheme

@Composable
fun MeasureRoute(
    paddingValues: PaddingValues
) {
    MeasureScreen()
}

@Composable
fun MeasureScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text("Measure")
    }
}

@Preview(showBackground = true)
@Composable
fun MeasureScreenPreview() {
    StempoTheme {
        MeasureScreen()
    }
}