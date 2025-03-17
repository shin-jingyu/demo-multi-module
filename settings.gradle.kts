rootProject.name = "blolet"

include("monolithic")
include("core")
include("core:jpa-core")
include("common")
include("services:board")
include("services:board:api")
include("services:board:api:domain")
include("services:board:api:exception")
include("services:board:application")
include("services:board:driven-rdb-adapter")
include("services:board:driving-web-adapter")

include("core:jpa-core")
include("services:board")
include("common")

findProject(":services:board")?.projectDir = file("services/board")
findProject(":services:board:api")?.projectDir = file("services/board/api")
findProject(":services:board:api:domain")?.projectDir = file("services/board/api/domain")
findProject(":services:board:api:exception")?.projectDir = file("services/board/api/exception")
findProject(":services:board:application")?.projectDir = file("services/board/application")
findProject(":services:board:driven-rdb-adapter")?.projectDir = file("services/board/driven-rdb-adapter")
findProject(":services:board:driving-web-adapter")?.projectDir = file("services/board/driving-web-adapter")

