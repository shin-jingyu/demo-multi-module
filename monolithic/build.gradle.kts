plugins {
    id("org.springframework.boot") version "3.4.3" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}



dependencies {
    implementation(project(":me:nettee:jpa-core"))
    implementation(project(":board"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}