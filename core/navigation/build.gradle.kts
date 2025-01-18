plugins {
    id("com.march.breeze.androidLibrary")
}

android {
    namespace = "com.march.core.navigation"
}

dependencies {
    implementation(libs.bundles.navigation)
    implementation(libs.bundles.ui.libraries)
}