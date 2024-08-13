plugins {
    id("callhandler-conventions")
}

group = Globals.CallHandler.GROUP_ID

dependencies {
    implementation(project(":interactors:accessor"))
}

