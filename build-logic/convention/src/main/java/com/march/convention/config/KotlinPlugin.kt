package com.march.convention.config

import com.android.build.gradle.LibraryExtension
import com.march.convention.Constants
import com.march.convention.extension.getBundle
import com.march.convention.extension.getPlugin
import com.march.convention.extension.implementation
import com.march.convention.extension.kotlinOptions
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

class KotlinPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply {
            apply(libs.getPlugin("kotlin-android"))
            apply(libs.getPlugin("kotlin-parcelize"))
            apply(libs.getPlugin("kotlin-serialization"))
        }

        extensions.configure<LibraryExtension> {
            compileOptions {
                sourceCompatibility = Constants.JAVA_VERSION
                targetCompatibility = Constants.JAVA_VERSION
            }

            kotlinOptions {
                jvmTarget.set(JvmTarget.fromTarget(Constants.jvmVersion))
            }
        }

        dependencies {
            implementation(libs.getBundle("kotlin"))
            implementation(libs.getBundle("coroutines"))
        }
    }
}