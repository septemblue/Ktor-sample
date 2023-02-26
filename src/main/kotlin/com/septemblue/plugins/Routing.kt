package com.septemblue.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond("Hello ktor")
        }
        get("/book/{page}") {
            val page = call.parameters["page"]

            call.respond("You are on page : $page")
        }
    }
}
