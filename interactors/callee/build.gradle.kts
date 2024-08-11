plugins {
    id("interactor-conventions")
}

group = "io.github.singlerr.semaphore"
version = "unspecified"

dependencies {
    implementation(project(":interactors:accessor"))
}
