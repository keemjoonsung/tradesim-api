import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.6"
}

tasks {
    named<BootJar>("bootJar") {
        enabled = false
    }
}

dependencies {
    implementation(project(":domain-auth"))

    implementation("org.springframework.boot:spring-boot-starter")

    implementation("org.springframework.data:spring-data-jpa")

    implementation("org.springframework.security:spring-security-crypto")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}