package com.march.convention.config

import com.android.build.gradle.LibraryExtension
import com.march.convention.extension.debugImplementation
import com.march.convention.extension.getBundle
import com.march.convention.extension.getLibrary
import com.march.convention.extension.getPlugin
import com.march.convention.extension.implementation
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class ComposePlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply {
            apply(libs.getPlugin("kotlin-compose"))
        }

        extensions.configure<LibraryExtension> {
            buildFeatures {
                compose = true
            }
        }

        dependencies {
            implementation(platform(libs.getLibrary("androidx-compose-bom")))
            implementation(libs.getBundle("compose"))
            implementation(libs.getBundle("ui-libraries"))
            debugImplementation(libs.getBundle("androidx-ui-test"))
        }
    }
}