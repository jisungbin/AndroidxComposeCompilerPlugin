plugins {
  id("org.jetbrains.kotlin.jvm") version "2.0.20-dev-6176"
}

kotlin {
  compilerOptions {
    optIn.addAll(
      "kotlin.RequiresOptIn",
      "org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi",
      "org.jetbrains.kotlin.utils.addToStdlib.UnsafeCastFunction",
      "org.jetbrains.kotlin.ir.symbols.UnsafeDuringIrConstructionAPI",
    )
  }
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-compiler:2.0.20-dev-6176")
}
