rootProject.name = "Esdiac"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

// Main app module
include(":composeApp")

// Core modules
include(":core:data")
include(":core:domain")
include(":core:designsystem")
include(":core:presentation")

// Feature modules - Auth
include(":features:auth:domain")
include(":features:auth:presentation")

// Feature modules - TopUp
include(":features:topup:data")
include(":features:topup:database")
include(":features:topup:domain")
include(":features:topup:presentation")
