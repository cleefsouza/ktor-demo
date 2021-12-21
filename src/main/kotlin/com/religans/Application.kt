package com.religans

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.religans.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        initDb()
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
