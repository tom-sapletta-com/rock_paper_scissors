import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
}

group = "game"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.testng:testng:7.1.0")
    implementation(kotlin("test"))
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


application {
    mainClass.set("MainKt")
}

sourceSets.main {
    java.srcDirs("src/main/kotlin/game")
}
/*

tasks.register("hello") {
    doLast {
        println("Hello world!")
    }
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "me.tom.Main"
    }
}
*/
tasks {
    test {
        testLogging.showExceptions = true
    }
}