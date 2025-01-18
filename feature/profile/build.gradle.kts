plugins {
    id("com.march.breeze.androidCompose")
}

android {
    namespace = "com.march.feature.profile"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.core.designsystem)
    implementation(projects.core.navigation)
    implementation(projects.core.common)

    implementation(libs.bundles.navigation)
    implementation(libs.bundles.ui.libraries)
}