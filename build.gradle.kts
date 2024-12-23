plugins {
	kotlin("jvm") version "1.9.25"

	kotlin("plugin.spring") version "1.9.25" apply false
	id("org.springframework.boot") version "3.4.0" apply false
	id("io.spring.dependency-management") version "1.1.6" apply false
}


group = "com.kjs990114"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects{
	apply(plugin = "org.jetbrains.kotlin.jvm")

	dependencies {
		implementation("org.jetbrains.kotlin:kotlin-stdlib")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
	}

	kotlin {
		compilerOptions {
			freeCompilerArgs.addAll("-Xjsr305=strict")
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}



