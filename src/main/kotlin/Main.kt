fun main() {
    println("Hello, Kotlin!")
}
plugins {
    kotlin("jvm") version "1.9.23"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

