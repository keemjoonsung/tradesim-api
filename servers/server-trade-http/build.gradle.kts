plugins {
    kotlin("plugin.spring")

    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    implementation(project(":app-auth"))
    implementation(project(":app-trade"))

    implementation(project(":domain-auth"))
    implementation(project(":domain-trade"))

    implementation(project(":infra-auth"))
    implementation(project(":infra-trade"))

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}