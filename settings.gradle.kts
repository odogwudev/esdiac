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

include("data")

include(":composeApp")
include("database")
include(":core:presentation")
include(":core:domain")
include("domain")
include(":core:data")
include(":core:designsystem")
include("domain")
include("designsystem")
include(":features:auth:presentation")
include(":features:auth:domain")
include(":features:topup:data")
include(":features:topup:database")
include(":features:topup:domain")
include(":features:topup:presentation")
include("domain")
include("presentation")
include("auth")
include("domain:api")
include("presentation")
include("domain:impl")
include("domain:glue")
