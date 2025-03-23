import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("java-library")
    id("org.springframework.boot") version "3.4.3" /*apply false*/
    id("io.spring.dependency-management") version "1.1.7" /*apply false*/
}

allprojects {
    repositories {
        mavenCentral()
    }
}


subprojects {
    apply {
        plugin("java")
        plugin("java-library")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    group = "me.nettee"

    tasks.withType<BootJar>{
        enabled = false
    }

    tasks.withType<Jar>{
        enabled = true
    }
}

extra["querydsl.version"] = "5.1.0"
val gradleLibraryDir = "gradle-librarys"
apply(from = "$gradleLibraryDir/monolithic-library.gradle.kts")
apply(from = "$gradleLibraryDir/board-library.gradle.kts")
apply(from = "$gradleLibraryDir/common-library.gradle.kts")
apply(from = "$gradleLibraryDir/core-library.gradle.kts")