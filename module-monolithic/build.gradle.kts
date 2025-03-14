plugins {
    id("java")
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "me.nettee"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":module-board"))
    implementation(project(":module-core"))
    implementation(project(":module-common"))
    implementation(project(":module-contracts"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}