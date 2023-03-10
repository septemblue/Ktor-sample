package com.septemblue

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.septemblue.plugins.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
fun Application.module() {
//    val port = environment.config.propertyOrNull("ktor.deplyoment.port")?.getString() ?: "8080"
    configureRouting()
}