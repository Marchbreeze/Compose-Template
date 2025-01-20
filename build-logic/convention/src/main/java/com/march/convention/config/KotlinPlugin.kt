package com.march.convention.config

import com.march.convention.Constants
import com.march.convention.extension.getBundle
import com.march.convention.extension.getPlugin
import com.march.convention.extension.implementation
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class KotlinPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply {
            apply(libs.getPlugin("kotlin-android"))
            apply(libs.getPlugin("kotlin-parcelize"))
            apply(libs.getPlugin("kotlin-serialization"))
        }

        tasks.withType<KotlinCompile>().configureEach {
            compilerOptions {
                jvmTarget.set(Constants.JVM_VERSION)
            }
        }

        dependencies {
            implementation(libs.getBundle("kotlinx"))
            implementation(libs.getBundle("coroutines"))
        }
    }
}