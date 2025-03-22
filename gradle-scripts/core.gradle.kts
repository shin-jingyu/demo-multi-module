val coreDir = "${rootProject.projectDir}/core"

include(
    ":jpa-core"
)

project(":jpa-core").projectDir = file("$coreDir/jpa-core")