plugins {
    id("java")
    id("java-library")
}


repositories {
    mavenCentral()
}

dependencies {
    api(project(":module-board:board-api"))
    api(project(":module-board:board-application"))
    api(project(":module-board:board-driven-adapters"))
    api(project(":module-board:board-driving-adapters"))
    implementation(project(":module-contracts"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}