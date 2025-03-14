plugins {
    id("java")
}

group = "me.nettee"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":module-contracts"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}