plugins {
    id("java")
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":services:board:api:domain"))
    // lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}