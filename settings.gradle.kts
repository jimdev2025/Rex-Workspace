// Name your root project
rootProject.name = "Rex-Workspace"

// Set up dependency resolution management
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

// Declare all subprojects (modules)
include(":Rex-Phone", ":commons", ":samples")

// Point to their actual folder paths
project(":Rex-Phone").projectDir = file("Rex-Phone")
project(":commons").projectDir = file("commons")
project(":samples").projectDir = file("samples")

