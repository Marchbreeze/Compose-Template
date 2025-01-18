import com.march.convention.extension.implementation

plugins {
    id("com.march.breeze.androidCompose")
}

android {
    namespace = "com.march.feature.main"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.core.designsystem)
    implementation(projects.core.navigation)
    implementation(projects.core.common)
    implementation(projects.feature.onboarding)
    implementation(projects.feature.home)
    implementation(projects.feature.profile)

    implementation(libs.bundles.navigation)
    implementation(libs.bundles.ui.libraries)
    implementation(libs.phoenix)
}