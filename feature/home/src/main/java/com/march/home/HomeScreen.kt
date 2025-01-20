package com.march.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.march.designsystem.theme.StempoTheme

@Composable
fun HomeRoute(
    paddingValues: PaddingValues
) {
    HomeScreen()
}

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text("Home")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    StempoTheme {
        HomeScreen()
    }
}