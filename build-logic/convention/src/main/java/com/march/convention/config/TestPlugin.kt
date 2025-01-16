package com.march.convention.config

import com.android.build.gradle.LibraryExtension
import com.march.convention.extension.androidTestImplementation
import com.march.convention.extension.getBundle
import com.march.convention.extension.getLibrary
import com.march.convention.extension.libs
import com.march.convention.extension.testImplementation
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class TestPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {

        extensions.configure<LibraryExtension> {
            defaultConfig {
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }
        }

        dependencies {
            testImplementation(libs.getLibrary("junit"))
            androidTestImplementation(libs.getBundle("androidx-test"))
        }
    }
}