package com.march.convention.plugin

import com.march.convention.config.ComposePlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

class AndroidComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply<AndroidLibraryPlugin>()
                apply<ComposePlugin>()
            }
        }
    }
}