import org.gradle.kotlin.dsl.checkstyle
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.repositories

plugins{
    checkstyle
    id("java")
}

version = System.getenv()["BUILD_NUMBER"] ?: "999"

repositories {
    gradlePluginPortal()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

