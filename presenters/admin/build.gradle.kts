plugins {
    id("presenter-conventions")
}

group = "io.github.singlerr.semaphore.presenter"
version = "unspecified"


dependencies {
    implementation(project(":interactors:admin"))
}