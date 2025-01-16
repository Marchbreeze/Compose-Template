package com.march.convention.config

import com.march.convention.extension.getLibrary
import com.march.convention.extension.getPlugin
import com.march.convention.extension.implementation
import com.march.convention.extension.ksp
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

class HiltPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply {
            apply(libs.getPlugin("ksp"))
            apply(libs.getPlugin("hilt"))
        }

        dependencies {
            implementation(libs.getLibrary("hilt-android"))
            ksp(libs.getLibrary("hilt-android-compiler"))
        }
    }
}
