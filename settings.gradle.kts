rootProject.name = "tradesim-api"

include(
    "server-trade-http",
    "server-trade-ws",

    "domain-trade",
    "domain-auth",

    "app-trade",
    "app-auth",

    "infra-trade",
    "infra-auth",
)

project(":server-trade-http").projectDir = file("servers/server-trade-http")
project(":server-trade-ws").projectDir = file("servers/server-trade-ws")

project(":domain-trade").projectDir = file("domains/domain-trade")
project(":domain-auth").projectDir = file("domains/domain-auth")

project(":app-trade").projectDir = file("apps/app-trade")
project(":app-auth").projectDir = file("apps/app-auth")

project(":infra-trade").projectDir = file("infrastructures/infra-trade")
project(":infra-auth").projectDir = file("infrastructures/infra-auth")



