package com.march.convention.extension

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions

fun CommonExtension<*, *, *, *, *, *>.kotlinOptions(block: KotlinJvmCompilerOptions.() -> Unit) {
    (this as ExtensionAware).extensions.configure("kotlinOptions", block)
}