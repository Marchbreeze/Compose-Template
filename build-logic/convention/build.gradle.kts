plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("AndroidApplicationPlugin") {
            id = "com.march.breeze.androidApplication"
            implementationClass = "com.march.convention.plugin.AndroidApplicationPlugin"
        }
        register("AndroidLibraryPlugin") {
            id = "com.march.breeze.androidLibrary"
            implementationClass = "com.march.convention.plugin.AndroidLibraryPlugin"
        }
        register("AndroidComposePlugin") {
            id = "com.march.breeze.androidCompose"
            implementationClass = "com.march.convention.plugin.AndroidComposePlugin"
        }
        register("JavaLibraryPlugin") {
            id = "com.march.breeze.javaLibrary"
            implementationClass = "com.march.convention.plugin.JavaLibraryPlugin"
        }

        register("CommonPlugin") {
            id = "com.march.breeze.common"
            implementationClass = "com.march.convention.config.CommonPlugin"
        }
        register("ComposePlugin") {
            id = "com.march.breeze.compose"
            implementationClass = "com.march.convention.config.ComposePlugin"
        }
        register("HiltPlugin") {
            id = "com.march.breeze.hilt"
            implementationClass = "com.march.convention.config.HiltPlugin"
        }
        register("KotlinPlugin") {
            id = "com.march.breeze.kotlin"
            implementationClass = "com.march.convention.config.KotlinPlugin"
        }
        register("TestPlugin") {
            id = "com.march.breeze.test"
            implementationClass = "com.march.convention.config.TestPlugin"
        }
    }
}