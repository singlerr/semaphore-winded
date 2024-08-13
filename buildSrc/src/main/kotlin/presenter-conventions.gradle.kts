plugins{
    id("base-conventions")
    `maven-publish`
}

group = Globals.Presenter.GROUP_ID

publishing{
    publications{
        create<MavenPublication>("mavenJava"){
            groupId = Globals.Presenter.GROUP_ID
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
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
