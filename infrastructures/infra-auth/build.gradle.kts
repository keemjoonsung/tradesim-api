<<<<<<< HEAD
=======
import org.jooq.meta.jaxb.Logging
>>>>>>> feat/infra-auth
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.6"
<<<<<<< HEAD
=======
    id("nu.studer.jooq") version "8.2"
>>>>>>> feat/infra-auth
}

tasks {
    named<BootJar>("bootJar") {
        enabled = false
    }
}

dependencies {
    implementation(project(":domain-auth"))
<<<<<<< HEAD

    implementation("org.springframework.boot:spring-boot-starter")

    implementation("org.springframework.data:spring-data-jpa")

    implementation("org.springframework.security:spring-security-crypto")
=======
    implementation(project(":domain-trade"))

    jooqGenerator("com.mysql:mysql-connector-j")
    jooqGenerator("org.jooq:jooq-meta:3.19.16")
    jooqGenerator("org.jooq:jooq-codegen:3.19.16")

    implementation("org.springframework.boot:spring-boot-starter-jdbc")

    runtimeOnly("com.mysql:mysql-connector-j")
>>>>>>> feat/infra-auth

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
<<<<<<< HEAD
=======
}

val jooqGeneratedFolder = "src/generated/kotlin"
val schemaName = "auth"

jooq {
    version.set("3.19.16")
    configurations {
        create("main") {
            generateSchemaSourceOnCompilation.set(true)
            jooqConfiguration.apply {
                logging = Logging.WARN

                jdbc.apply {
                    driver = "com.mysql.cj.jdbc.Driver"
                    url = (System.getenv("DB_URL") ?: "jdbc:mysql://localhost:3306") + "/$schemaName"
                    user = System.getenv("DB_USER") ?: "root"
                    password = System.getenv("DB_PWD") ?: "user1234"
                }

                generator.apply {
                    name = "org.jooq.codegen.KotlinGenerator"
                    database.apply {
                        name = "org.jooq.meta.mysql.MySQLDatabase"
                        includes = ".*"
                        forcedTypes.addAll(
                            listOf(
                                org.jooq.meta.jaxb.ForcedType()
                                    .withName("BOOLEAN")
                                    .withIncludeTypes("(?i:TINYINT(UNSIGNED)?\\(1\\))")
                            )
                        )
                    }
                    generate.apply {
                        isDeprecated = false
                        isRecords = true
                        isFluentSetters = true
                    }
                    target.apply {
                        packageName = "com.kjs990114.infra.persistence.jooq.trade"
                        directory = jooqGeneratedFolder
                    }
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"

                    }



            }
        }
    }
}

sourceSets {
    main {
        java {
            srcDir(jooqGeneratedFolder)
        }
    }
>>>>>>> feat/infra-auth
}