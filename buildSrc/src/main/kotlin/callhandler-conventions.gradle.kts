plugins{
    id("base-conventions")
    `maven-publish`
}

group = Globals.CallHandler.GROUP_ID

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
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/singlerr/semaphore-winded")
            credentials {
                username = System.getProperty("GITHUB_ACTOR")
                password = System.getProperty("GITHUB_TOKEN")
            }
        }
    }
}
