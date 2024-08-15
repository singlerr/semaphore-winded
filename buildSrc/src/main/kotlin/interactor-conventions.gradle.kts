plugins{
    id("base-conventions")
    `maven-publish`
    signing
}

group = Globals.Interactor.GROUP_ID

publishing{
    publications{
        create<MavenPublication>("mavenJava"){
            groupId = group.toString()
            artifactId = project.name
            setVersion(project.version)
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "localMaven"
            url = File(project.findProperty("localMvnRepo").toString()).toURI()
        }
    }
}