package com.march.convention

import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

object Constants {
    const val packageName = "com.march.breeze"

    const val compileSdk = 35
    const val minSdk = 28
    const val targetSdk = 35

    const val versionCode = 1
    const val versionName = "1.0.0"

    val JVM_VERSION = JvmTarget.JVM_11
    val JAVA_VERSION = JavaVersion.VERSION_11
}
