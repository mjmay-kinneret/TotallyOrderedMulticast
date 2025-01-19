plugins {
    id("java")
    application
}

group = "il.ac.kinneret.tom.Main"
version = "5785"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("il.ac.kinneret.tom.TomMain")
}
tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "il.ac.kinneret.tom.TomMain"
    }
}