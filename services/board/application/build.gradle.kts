plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":services:board:api"))
    implementation(project(":common"))

    // spring
    implementation("org.springframework:spring-context")
    implementation("org.springframework.data:spring-data-commons")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}
