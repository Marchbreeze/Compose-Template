plugins {
    id("com.march.breeze.androidApplication")
}

dependencies {
    implementation(projects.data)
    implementation(projects.feature.main)
    implementation(projects.feature.onboarding)
}