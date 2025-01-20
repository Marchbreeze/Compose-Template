package com.march.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.march.designsystem.theme.StempoTheme

@Composable
fun ProfileRoute(
    paddingValues: PaddingValues
) {
    ProfileScreen()
}

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text("Profile")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    StempoTheme {
        ProfileScreen()
    }
}