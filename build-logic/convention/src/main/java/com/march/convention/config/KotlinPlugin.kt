package com.march.convention.config

import com.march.convention.extension.getBundle
import com.march.convention.extension.getPlugin
import com.march.convention.extension.implementation
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

class KotlinPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply {
            apply(libs.getPlugin("kotlin-android"))
            apply(libs.getPlugin("kotlin-parcelize"))
            apply(libs.getPlugin("kotlin-serialization"))
        }

        dependencies {
            implementation(libs.getBundle("kotlin"))
            implementation(libs.getBundle("coroutines"))
        }
    }
}