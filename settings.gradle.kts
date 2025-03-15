rootProject.name = "demo-multi-module"


//include("module-board")
//include("module-contracts")
//include("module-monolithic")
//include("module-common")
//include("module-core")

//include("module-board:board-web-adapter")
//include("module-board:board-application")
//include("module-board:board-api")
//include("module-board:board-driving-adapters")
//include("module-board:board-driving-adapters:board-web-adapter")
//include("module-board:board-driven-adapters")
//include("module-board:board-driven-adapters:board-rdb-adapter")
//findProject(":module-board:board-driving-adapters:board-web-adapter")?.name = "board-web-adapter"
//findProject(":module-board:board-driven-adapters:board-rdb-adapter")?.name = "board-rdb-adapter"
//findProject(":module-board:board-driven-adapters")?.name = "board-driven-adapters"
//findProject(":module-board:board-api")?.name = "board-api"
//findProject(":module-board:board-driving-adapters")?.name = "board-driving-adapters"
//findProject(":module-board:board-application")?.name = "board-application"
//findProject(":module-board:board-web-adapter")?.name = "board-web-adapter"
val modules = mapOf(
    "module-board" to listOf(
        "module-board",
        "module-board:board-api",
        "module-board:board-application",
        "module-board:board-driving-adapters:board-web-adapter",
        "module-board:board-driven-adapters:board-rdb-adapter"
    ),
    "module-contracts" to listOf("module-contracts"),
    "module-monolithic" to listOf("module-monolithic"),
    "module-common" to listOf("module-common"),
    "module-core" to listOf("module-core")
).flatMap { it.value }.forEach(::include)