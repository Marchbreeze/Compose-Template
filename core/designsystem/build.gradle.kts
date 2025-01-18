plugins {
    id("com.march.breeze.androidCompose")
}

android {
    namespace = "com.march.core.designsystem"
}
dependencies {
    implementation(projects.core.common)
}
