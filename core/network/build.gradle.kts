plugins {
    id("com.march.breeze.androidLibrary")
}

android {
    namespace = "com.march.core.network"

    buildTypes {
        debug {
            val devUrl = properties["test.base.url"].toString()
            buildConfigField("String", "BASE_URL", devUrl)
        }

        release {
            val prodUrl = properties["base.url"].toString()
            buildConfigField("String", "BASE_URL", prodUrl)
        }
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(platform(libs.okhttp.bom))
    implementation(libs.bundles.okhttp)
    implementation(platform(libs.retrofit.bom))
    implementation(libs.bundles.retrofit)
    implementation(libs.phoenix)
}