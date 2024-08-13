plugins {
    id("controller-conventions")
}

dependencies{
    implementation(project(":interactors:accessor"))
    implementation(project(":interactors:admin"))
}