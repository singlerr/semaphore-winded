plugins{
    id("base-conventions")
    `maven-publish`
    signing
}

group = Globals.Presenter.GROUP_ID

publishing{
    publications{
        create<MavenPublication>("mavenJava"){
            groupId = Globals.CallHandler.GROUP_ID
            artifactId = project.name
            setVersion(project.version)
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "sonatype"
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("PASSWORD")
            }
        }
    }
}

signing{
    sign(publishing.publications.findByName("mavenJava"))
}
