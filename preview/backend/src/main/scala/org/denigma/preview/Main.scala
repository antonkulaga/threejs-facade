package org.denigma.preview

import akka.actor.ActorSystem
import akka.http.scaladsl.{Http, HttpExt}
import akka.stream.ActorMaterializer
import com.typesafe.config.Config


object Main extends App with Routes {

  implicit val system = ActorSystem("my-system")
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val server: HttpExt = Http(system)
  val config: Config = system.settings.config

  val (host, port) = (config.getString("app.host"), config.getInt("app.port"))
  val bindingFuture = server.bindAndHandle(routes, host, port)(materializer)

  println(s"starting server at $host:$port")
}

