import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("java-library")
    id("org.springframework.boot") version "3.4.3" /*apply false*/
    id("io.spring.dependency-management") version "1.1.7" /*apply false*/
}

repositories {
    mavenCentral()
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

val lombokModules = listOf(
    ":common",
    ":jpa-core",
    ":board:domain",
    ":board:model",
    ":board:application",
    ":board:driven-rdb-adapter",
    ":board:driving-web-adapter"
)

lombokModules.forEach {
    project(it).dependencies {
            compileOnly("org.projectlombok:lombok")
            annotationProcessor("org.projectlombok:lombok")
    }
}


project(":common").dependencies {
    api("org.springframework:spring-web")
    // Jackson
    api("com.fasterxml.jackson.core:jackson-annotations:2.15.2")
}

project(":jpa-core").dependencies {
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    // querydsl
    implementation("com.querydsl:querydsl-jpa:${dependencyManagement.importedProperties["querydsl.version"]}:jakarta")
    annotationProcessor("com.querydsl:querydsl-apt:${dependencyManagement.importedProperties["querydsl.version"]}:jakarta")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api")
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")
}

project(":monolithic").dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

project(":board:application").dependencies {
    // spring
    implementation("org.springframework:spring-context")
    implementation("org.springframework.data:spring-data-commons")
}

project(":board:driven-rdb-adapter").dependencies {
    // spring
    implementation("org.springframework:spring-context")
    // mapstruct
    implementation("org.mapstruct:mapstruct:1.6.3")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.6.3")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    // database
    runtimeOnly("org.postgresql:postgresql:42.7.4")
    // flyway
    implementation("org.flywaydb:flyway-database-postgresql")
    // querydsl
    implementation("com.querydsl:querydsl-jpa:${dependencyManagement.importedProperties["querydsl.version"]}:jakarta")
    annotationProcessor("com.querydsl:querydsl-apt:${dependencyManagement.importedProperties["querydsl.version"]}:jakarta")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api")
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")
}

project(":board:driving-web-adapter").dependencies {
    // spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.data:spring-data-commons")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    // mapstruct
    implementation("org.mapstruct:mapstruct:1.6.3")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.6.3")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
}