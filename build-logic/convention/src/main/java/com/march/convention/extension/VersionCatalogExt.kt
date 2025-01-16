package com.march.convention.extension

import org.gradle.api.artifacts.ExternalModuleDependencyBundle
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.provider.Provider
import org.gradle.plugin.use.PluginDependency

fun VersionCatalog.getBundle(bundleName: String): Provider<ExternalModuleDependencyBundle> =
    findBundle(bundleName).orElseThrow {
        NoSuchElementException("Bundle with name $bundleName not found in the catalog")
    }

fun VersionCatalog.getLibrary(libraryName: String): Provider<MinimalExternalModuleDependency> =
    findLibrary(libraryName).orElseThrow {
        NoSuchElementException("Library with name $libraryName not found in the catalog")
    }

fun VersionCatalog.getPlugin(pluginName: String): Provider<PluginDependency> =
    findPlugin(pluginName).orElseThrow {
        NoSuchElementException("Plugin with name $pluginName not found in the catalog")
    }