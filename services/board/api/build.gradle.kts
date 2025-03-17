plugins {
    id("java")
    id("java-library")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":services:board:api:domain"))
    api(project(":services:board:api:exception"))

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}