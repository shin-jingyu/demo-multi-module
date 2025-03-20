val boardDir = "${rootProject.projectDir}/services"

include(":board")

include(
    ":board:api",
    ":board:domain",
    ":board:exception",
    ":board:model"
)

include(
    ":board:application",
    ":board:driven-rdb-adapter",
    ":board:driving-web-adapter"
)


project(":board").projectDir = file("$boardDir/board")
project(":board:api").projectDir = file("$boardDir/board/api")
project(":board:domain").projectDir = file("$boardDir/board/api/domain")
project(":board:exception").projectDir = file("$boardDir/board/api/exception")
project(":board:model").projectDir = file("$boardDir/board/api/model")
project(":board:application").projectDir = file("$boardDir/board/application")
project(":board:driven-rdb-adapter").projectDir = file("$boardDir/board/driven-rdb-adapter")
project(":board:driving-web-adapter").projectDir = file("$boardDir/board/driving-web-adapter")