project(":jpa-core").dependencies {
    add("api", "org.springframework.boot:spring-boot-starter-data-jpa")
    // lombok
    add("compileOnly","org.projectlombok:lombok")
    add("annotationProcessor","org.projectlombok:lombok")
    // querydsl
    add("implementation", "com.querydsl:querydsl-jpa:${rootProject.extra["querydsl.version"]}:jakarta")
    add("annotationProcessor", "com.querydsl:querydsl-apt:${rootProject.extra["querydsl.version"]}:jakarta")
    add("annotationProcessor", "jakarta.persistence:jakarta.persistence-api")
    add("annotationProcessor", "jakarta.annotation:jakarta.annotation-api")
}