plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.21"
    id("java-library")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("com.typesafe.play:play_2.13:2.8.8")
}

publishing {

    repositories {
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/casually-blue/com.github.casually-blue.web")
            credentials {
                username= project.findProperty("gpr.user") as String?
                password= project.findProperty("gpr.key") as String?
            }
        }
    }

    publications {
        create<MavenPublication>("github"){
            groupId = "com.github.casually-blue"
            artifactId = "web"
            version = "1.0"

            from(components["java"])
        }
    }
}