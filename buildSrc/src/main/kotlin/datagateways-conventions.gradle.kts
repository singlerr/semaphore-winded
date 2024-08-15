import gradle.kotlin.dsl.accessors._75dcd27d785490f46d3d6fcf15a326ca.publishing
import gradle.kotlin.dsl.accessors._75dcd27d785490f46d3d6fcf15a326ca.signing

plugins{
    id("base-conventions")
    `maven-publish`
    signing
}

group = Globals.DataGateways.GROUP_ID

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