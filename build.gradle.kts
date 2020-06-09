plugins {
    kotlin("jvm") version "1.3.72"
}

group = "org.bitbucket.parangee"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public")
}

dependencies {
    implementation("com.destroystokyo.paper:paper-api:1.15.2-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}