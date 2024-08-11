import gradle.kotlin.dsl.accessors._dc4d05473e8224611f7ddf3b32129942.test
import gradle.kotlin.dsl.accessors._dc4d05473e8224611f7ddf3b32129942.testImplementation
import org.gradle.kotlin.dsl.checkstyle
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.repositories

plugins{
    checkstyle
    id("java")
}

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