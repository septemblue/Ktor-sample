package com.septemblue.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            println("URI: ${call.request.uri}")
            println("Headers: ${call.request.headers.names()}")
            println("User-Agent: ${call.request.headers["User-Agent"]}")
            print("Query params: ${call.request.queryParameters.names()}")
            print(" Name: ${call.request.queryParameters["name"] ?: "blank"}")
            print(" Email: ${call.request.queryParameters["email"] ?: "blank"}")

            call.respond("Hello ktor")
        }
    }
}
