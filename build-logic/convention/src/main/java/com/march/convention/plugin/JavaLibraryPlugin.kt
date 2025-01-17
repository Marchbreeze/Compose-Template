package com.march.convention.plugin

import com.march.convention.Constants
import com.march.convention.extension.getBundle
import com.march.convention.extension.getLibrary
import com.march.convention.extension.getPlugin
import com.march.convention.extension.implementation
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class JavaLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) =
        with(target) {
            pluginManager.apply {
                apply(libs.getPlugin("java-library"))
                apply(libs.getPlugin("kotlin-jvm"))
            }

            extensions.configure<JavaPluginExtension> {
                sourceCompatibility = Constants.JAVA_VERSION
                targetCompatibility = Constants.JAVA_VERSION
            }

            dependencies {
                implementation(libs.getBundle("kotlinx"))
                implementation(libs.getLibrary("kotlinx-coroutines-core"))
                implementation(libs.getLibrary("javax-inject"))
            }
        }
}