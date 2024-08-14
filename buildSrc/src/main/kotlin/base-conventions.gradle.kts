import org.gradle.kotlin.dsl.checkstyle
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.repositories
import java.util.Properties

plugins{
    checkstyle
    id("java")
}

version = "${Globals.MAJOR_VERSION}.${System.getenv()["BUILD_NUMBER"] ?: "999"}"

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

