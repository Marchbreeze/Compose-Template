enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {

    includeBuild("build-logic")

    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Compose-Template"
include(":app")
include(":domain")
include(":data")
include(":core:network")
include(":core:common")
include(":core:datastore")
include(":core:designsystem")
include(":core:navigation")
include(":feature:main")
include(":feature:onboarding")
include(":feature:home")
include(":feature:profile")
