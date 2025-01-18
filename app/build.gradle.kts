plugins {
    id("com.march.breeze.androidApplication")
}

android {
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
    implementation(projects.data)
}