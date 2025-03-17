plugins {
    id("java")
}

group = "me.nettee"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}