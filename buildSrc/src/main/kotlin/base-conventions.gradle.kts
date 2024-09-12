import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories

plugins {
    id("java")
}

version = "${Globals.MAJOR_VERSION}.${System.getenv()["BUILD_NUMBER"] ?: "999"}"

java {
    withSourcesJar()
    withJavadocJar()

    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
}

tasks.javadoc {
    isFailOnError = false
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}


tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}
