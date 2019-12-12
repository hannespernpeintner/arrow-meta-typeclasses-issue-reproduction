pluginManagement {
    repositories {
        maven {
            url = `java.net`.URI("https://oss.jfrog.org/artifactory/oss-snapshot-local/")
        }

        gradlePluginPortal()
    }
}

rootProject.name = "arrow-meta-playground"

