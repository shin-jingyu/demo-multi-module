plugins {
    id("java")
}


allprojects{
    group = "me.nettee"

    tasks.withType<JavaCompile>{
        sourceCompatibility = JavaVersion.VERSION_21.toString()
        targetCompatibility = JavaVersion.VERSION_21.toString()
    }
    repositories {
        mavenCentral()
    }
}