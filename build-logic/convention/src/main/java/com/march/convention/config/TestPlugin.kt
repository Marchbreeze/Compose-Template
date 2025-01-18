package com.march.convention.config

import com.march.convention.extension.androidTestImplementation
import com.march.convention.extension.getBundle
import com.march.convention.extension.getLibrary
import com.march.convention.extension.libs
import com.march.convention.extension.testImplementation
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class TestPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {

        dependencies {
            testImplementation(libs.getLibrary("junit"))
            androidTestImplementation(libs.getBundle("androidx-test"))
        }
    }
}