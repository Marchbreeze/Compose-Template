package com.march.convention.config

import com.march.convention.extension.getLibrary
import com.march.convention.extension.implementation
import com.march.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class CommonPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        dependencies {
            implementation(libs.getLibrary("timber"))
        }
    }
}
