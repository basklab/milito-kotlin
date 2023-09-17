import config.AncientBritish
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.contentnegotiation.*

fun main() {
    embeddedServer(Netty, port = 9000, host = "127.0.0.1") {
        install(ContentNegotiation) {
            json()
        }
        routing {
            get("/") {
                call.respondText("OLOLO", status = HttpStatusCode.OK)
            }
            get("/api/game/event") {
                call.respond(AncientBritish.leaders[0])
//                call.respondText("OLOLO", status = HttpStatusCode.OK)
            }
        }
    }.start(wait = true)
}
