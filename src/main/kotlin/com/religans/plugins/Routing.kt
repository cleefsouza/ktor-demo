package com.religans.plugins

import com.religans.routes.registerArticleRoutes
import com.religans.routes.registerUserRoutes
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello, world!")
        }
    }

    registerUserRoutes()
    registerArticleRoutes()
}
