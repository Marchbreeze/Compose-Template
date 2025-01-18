plugins {
    id("com.march.breeze.androidCompose")
}

android {
    namespace = "com.march.feature.main"
}

dependencies {
    implementation(libs.bundles.navigation)
    implementation(libs.bundles.ui.libraries)
    implementation(libs.phoenix)
}