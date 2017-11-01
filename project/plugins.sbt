addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.3") // advanced assets handling

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.20")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.6")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1") //live refresh

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.1") // packaging for production

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.3.4") // templates

addSbtPlugin("com.gilt" % "sbt-dependency-graph-sugar" % "0.8.2") // visual dependency management

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0") // for publishing

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.3")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC13")
