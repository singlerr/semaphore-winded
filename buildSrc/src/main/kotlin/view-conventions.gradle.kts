plugins {
    id("base-conventions")
    `maven-publish`
}

group = Globals.View.GROUP_ID

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = group.toString()
            artifactId = project.name
            setVersion(project.version)
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "localMaven"
            url = uri(project.findProperty("localMvnRepo")!!.toString())
        }
    }
}