plugins {
    id("java")
    id("java-library")
}

group = "me.nettee"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":module-board:board-driving-adapters:board-web-adapter"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}