package com.march.convention.plugin

import com.android.build.api.dsl.ApplicationExtension
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

class AndroidApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply {
            apply(libs.getPlugin("android-application"))
            apply<KotlinPlugin>()
            apply<HiltPlugin>()
            apply<CommonPlugin>()
            apply<TestPlugin>()
        }

        extensions.configure<ApplicationExtension> {
            namespace = Constants.packageName
            compileSdk = Constants.compileSdk

            defaultConfig {
                applicationId = Constants.packageName
                targetSdk = Constants.targetSdk
                minSdk = Constants.minSdk
                versionCode = Constants.versionCode
                versionName = Constants.versionName
            }

            buildTypes {
                release {
                    isMinifyEnabled = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro",
                    )
                }
            }
        }
    }
}