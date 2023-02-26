package com.septemblue.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.contactUsModule() {
    routing {
        get("/contactus") {
            call.respond("Hello from contactUs Module")
        }
        get("/aboutus") {
            call.respond("About us from contactUs Module")
        }
    }
}