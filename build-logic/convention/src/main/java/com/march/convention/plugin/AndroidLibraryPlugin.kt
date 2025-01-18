package com.march.convention.plugin

import com.android.build.gradle.LibraryExtension
import com.march.convention.Constants
import com.march.convention.config.CommonPlugin
import com.march.convention.config.HiltPlugin
import com.march.convention.config.KotlinPlugin
import com.march.convention.config.TestPlugin
import com.march.convention.extension.getPlugin
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class AndroidLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) =
        with(target) {
            pluginManager.apply {
                apply(libs.getPlugin("android-library"))
                apply<KotlinPlugin>()
                apply<HiltPlugin>()
                apply<CommonPlugin>()
                apply<TestPlugin>()
            }

            extensions.configure<LibraryExtension> {
                compileSdk = Constants.compileSdk

                defaultConfig {
                    minSdk = Constants.minSdk
                    consumerProguardFiles("consumer-rules.pro")
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                compileOptions {
                    sourceCompatibility = Constants.JAVA_VERSION
                    targetCompatibility = Constants.JAVA_VERSION
                }
            }
        }
}