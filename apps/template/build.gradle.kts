plugins {
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.springframework.boot") version "2.7.2"
    id("java")
    id("com.google.cloud.tools.jib") version "3.3.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("org.springframework.fu:spring-fu-jafu:0.5.1")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("net.logstash.logback:logstash-logback-encoder:7.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-starter-webflux")
}

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://repo.spring.io/milestone")
    maven("https://repo.spring.io/snapshot")
}

tasks.withType<Test> {
    useJUnitPlatform()
}