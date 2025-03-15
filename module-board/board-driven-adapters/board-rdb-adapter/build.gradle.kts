plugins {
    id("java")
}

group = "me.nettee"
version = "unspecified"

repositories {
    mavenCentral()
}

apply(from = "../module-common/build.gradle.kts")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}