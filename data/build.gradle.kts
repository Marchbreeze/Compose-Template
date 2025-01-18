import com.march.convention.extension.implementation

plugins {
    id("com.march.breeze.androidLibrary")
}

android {
    namespace = "com.march.data"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.core.network)

    implementation(platform(libs.okhttp.bom))
    implementation(libs.bundles.okhttp)
    implementation(platform(libs.retrofit.bom))
    implementation(libs.bundles.retrofit)
}
