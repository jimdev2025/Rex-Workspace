// Name your root project
rootProject.name = "Rex-Workspace"

// From original Rex-Phone/settings.gradle.kts
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

// From original Rex-Commons/settings.gradle.kts
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// Declare all subprojects (modules)
include(":app", ":commons", ":samples")

// Point to their actual folder paths
project(":app").projectDir = file("Rex-Phone/app")
project(":commons").projectDir = file("Rex-Commons/commons")
project(":samples").projectDir = file("Rex-Commons/samples")
