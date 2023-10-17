plugins {
  kotlin("jvm") version "1.9.10"
}

repositories {
  mavenCentral()
}

sourceSets {
  getByName("main").java.srcDir("src/main/kotlin")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.9.10")
}