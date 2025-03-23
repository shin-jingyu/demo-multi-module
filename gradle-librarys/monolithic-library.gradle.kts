project(":common").dependencies {
        add("api","org.springframework:spring-web")
        // Jackson
        add("api","com.fasterxml.jackson.core:jackson-annotations:2.15.2")
        // lombok
        add("compileOnly","org.projectlombok:lombok")
        add("annotationProcessor","org.projectlombok:lombok")
}