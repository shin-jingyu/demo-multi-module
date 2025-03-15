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
    implementation(project(":module-board:board-application"))
    implementation(project(":module-board:board-api"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}