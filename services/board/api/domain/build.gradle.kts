plugins {
    id("java")
}

version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    // lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}
