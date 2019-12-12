buildscript {
    repositories {
        maven {
            setUrl("https://plugins.gradle.org/m2/")
        }
        maven {
            setUrl("https://oss.jfrog.org/artifactory/oss-snapshot-local/")
        }
    }
    dependencies {
        val arrowMetaVersion="1.3.60-0-296e310"
        classpath("io.arrow-kt:gradle-plugin:$arrowMetaVersion")
    }
}

plugins {
    kotlin("jvm") version "1.3.60"
}
apply(plugin = "io.arrow-kt.arrow")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.arrow-kt:arrow-annotations:0.10.3")
    implementation("io.arrow-kt:arrow-core:0.10.3")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform()
    }
}

repositories {
    maven {
        setUrl("https://plugins.gradle.org/m2/")
    }
    maven {
        setUrl("https://oss.jfrog.org/artifactory/oss-snapshot-local/")
    }
}