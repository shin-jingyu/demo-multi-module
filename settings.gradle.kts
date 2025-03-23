rootProject.name = "demo-multi-module"

val gradleScriptsDir = "gradle-scripts"
apply(from = "$gradleScriptsDir/core.gradle.kts")
apply(from = "$gradleScriptsDir/board.gradle.kts")
apply(from = "$gradleScriptsDir/common.gradle.kts")
apply(from = "$gradleScriptsDir/monolithic.gradle.kts")