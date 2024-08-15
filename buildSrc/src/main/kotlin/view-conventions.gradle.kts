import gradle.kotlin.dsl.accessors._75dcd27d785490f46d3d6fcf15a326ca.publishing

plugins{
    id("base-conventions")
    `maven-publish`
}

group = Globals.View.GROUP_ID

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