rootProject.name = "plymouth"

pluginManagement {
    repositories {
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "Quilt"
            url = uri("https://maven.quiltmc.org/repository/release/")
            content {
                includeGroup("org.quiltmc")
            }
        }
        maven {
            name = "The Glitch"
            url = uri("https://maven.the-glitch.network/")
            content {
                includeModule("net.kjp12", "plymouth-loom")
                includeModule("plymouth-loom", "plymouth-loom.gradle.plugin")
            }
        }
        gradlePluginPortal()
    }
    plugins {
        id("plymouth-loom") version System.getProperty("loom_version")!!
        id("com.diffplug.spotless") version System.getProperty("spotless_version")!!
        id("com.modrinth.minotaur") version System.getProperty("minotaur_version")!!
    }
}

include("utilities", "database", "ply-common", "ply-anti-xray", "ply-locking", "ply-tracker", "ply-database", "ply-debug")