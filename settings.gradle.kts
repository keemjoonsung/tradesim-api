rootProject.name = "tradesim-api"

include(
    "server-trade-api",
    "server-trade-ws",
    "domain-trade",
    "app-trade",
    "app-auth",
    "infra-trade"
)

project(":server-trade-api").projectDir = file("servers/server-trade-api")
project(":server-trade-ws").projectDir = file("servers/server-trade-ws")
project(":domain-trade").projectDir = file("domains/domain-trade")
project(":app-trade").projectDir = file("apps/app-trade")
project(":app-auth").projectDir = file("apps/app-auth")
project(":infra-trade").projectDir = file("infrastructures/infra-trade")



