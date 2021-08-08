plugins {
    id("java-library")
    id("maven-publish")
    id("signing")

    kotlin("jvm") version "1.5.21"
}

group = "io.github.casually-blue"
version = "1.7"


repositories {
    mavenCentral()
}

dependencies {
    implementation("com.typesafe.play:play_2.12:2.8.8")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = project.property("ossrhUsername") as String?
                password = project.property("ossrhPassword") as String?
            }
        }
    }

    publications {
        create<MavenPublication>("mavenJava") {
            pom {

                groupId = "io.github.casually-blue"
                artifactId = "web"
                name.set("web")
                description.set("Kotlin html templating library")
                url.set("https://github.com/casually-blue/web")

                from(components["java"])

                licenses {
                    license {
                        name.set("GPL Version 3.0")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.txt")
                    }
                }
                scm {
                    connection.set("scm:git:git@github.com:casually-blue/web.git")
                    developerConnection.set("scm:git:git@github.com:casually-blue/web.git")
                    url.set("https://github.com/casually-blue/web")
                }

                developers {
                    developer {
                        id.set("tterry")
                        name.set("Thomas Terry")
                        email.set("darkforestsilence@gmail.com")
                        url.set("https://github.com/casually-blue")
                    }
                }
            }
        }
    }
}

signing {
    sign(publishing.publications)
}
