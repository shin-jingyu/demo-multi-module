plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":services:board:api:exception"))
    implementation(project(":services:board:api:domain"))
    implementation(project(":common"))

    // spring
    implementation("org.springframework:spring-context")
    implementation("org.springframework.data:spring-data-commons")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}
