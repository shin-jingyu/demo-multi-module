import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "3.4.3" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
}


subprojects {
    apply {
        plugin("java")
        plugin("java-library")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    group = "me.nettee"

    repositories {
        mavenCentral()
    }

    tasks.withType<BootJar>{
        enabled = false
    }

    tasks.withType<Jar>{
        enabled = true
    }
}