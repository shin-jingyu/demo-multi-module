val coreDir = "${rootProject.projectDir}/core"

include(
    ":me:nettee:jpa-core"
)

project(":me:nettee:jpa-core").projectDir = file("$coreDir/jpa-core")