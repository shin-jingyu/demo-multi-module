plugins {
    id("java")
    id("java-library")
}

version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":services:board:api"))
    api(project(":services:board:application"))
    api(project(":services:board:driven-rdb-adapter"))
    api(project(":services:board:driving-web-adapter"))

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}