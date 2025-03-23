project(":board:domain").dependencies {
    // lombok
    add("compileOnly","org.projectlombok:lombok")
    add("annotationProcessor","org.projectlombok:lombok")
}

project(":board:model").dependencies {
    // lombok
    add("compileOnly","org.projectlombok:lombok")
    add("annotationProcessor","org.projectlombok:lombok")
}

project(":board:application").dependencies {
    // spring
    add("implementation","org.springframework:spring-context")
    add("implementation","org.springframework.data:spring-data-commons")
    // lombok
    add("compileOnly","org.projectlombok:lombok")
    add("annotationProcessor","org.projectlombok:lombok")
}

project(":board:driven-rdb-adapter").dependencies {
    // spring
    add("implementation", "org.springframework:spring-context")
    // mapstruct
    add("implementation", "org.mapstruct:mapstruct:1.6.3")
    add("annotationProcessor", "org.mapstruct:mapstruct-processor:1.6.3")
    add("annotationProcessor", "org.projectlombok:lombok-mapstruct-binding:0.2.0")
    // database
    add("runtimeOnly", "org.postgresql:postgresql:42.7.4")
    // flyway
    add("implementation", "org.flywaydb:flyway-database-postgresql")
    // lombok
    add("compileOnly","org.projectlombok:lombok")
    add("annotationProcessor","org.projectlombok:lombok")
    // querydsl
    add("implementation", "com.querydsl:querydsl-jpa:${rootProject.extra["querydsl.version"]}:jakarta")
    add("annotationProcessor", "com.querydsl:querydsl-apt:${rootProject.extra["querydsl.version"]}:jakarta")
    add("annotationProcessor", "jakarta.persistence:jakarta.persistence-api")
    add("annotationProcessor", "jakarta.annotation:jakarta.annotation-api")
}

project(":board:driving-web-adapter").dependencies {
    // spring
    add("implementation", "org.springframework.boot:spring-boot-starter-web")
    add("implementation", "org.springframework.data:spring-data-commons")
    add("implementation", "org.springframework.boot:spring-boot-starter-validation")
    // mapstruct
    add("implementation", "org.mapstruct:mapstruct:1.6.3")
    add("annotationProcessor", "org.mapstruct:mapstruct-processor:1.6.3")
    add("annotationProcessor", "org.projectlombok:lombok-mapstruct-binding:0.2.0")
    // lombok
    add("compileOnly","org.projectlombok:lombok")
    add("annotationProcessor","org.projectlombok:lombok")
}