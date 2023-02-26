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
        get("/book/{page}") {
            val page = call.parameters["page"]

            call.respondText { "You are on page : $page" }
        }
        get("/login") {

            // Receive body, but we need class that resemble the structure of the json
            val userInfo = call.receive<UserInfo>()
            println("User info : ${userInfo}")
            call.respondText("You are on login page")
        }
    }
}

@kotlinx.serialization.Serializable
data class UserInfo(
    val email: String,
    val password: String,
)