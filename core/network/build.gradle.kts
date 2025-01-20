import java.util.Properties

plugins {
    id("com.march.breeze.androidLibrary")
}

android {
    namespace = "com.march.core.network"

    val properties = Properties().apply {
        load(rootProject.file("local.properties").inputStream())
    }

    buildTypes {
        debug {
            val devUrl = properties["base.url"].toString()
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
    implementation(projects.domain)

    implementation(platform(libs.okhttp.bom))
    implementation(libs.bundles.okhttp)
    implementation(platform(libs.retrofit.bom))
    implementation(libs.bundles.retrofit)
    implementation(libs.phoenix)
}