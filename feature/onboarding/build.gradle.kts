plugins {
    id("com.march.breeze.androidCompose")
}

android {
    namespace = "com.march.feature.onboarding"
}

dependencies {
    implementation(libs.bundles.navigation)
    implementation(libs.bundles.ui.libraries)
}