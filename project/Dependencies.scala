import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object Dependencies {
  // scalastyle:off
  //libs for testing
  lazy val testing: Def.Initialize[Seq[ModuleID]] = Def.setting(Seq(
    "org.scalatest" %%% "scalatest" % Versions.scalaTest % Test
  ))

  //akka-related libs
  lazy val akka = Def.setting(Seq(

    "org.denigma" %%% "akka-http-extensions" % Versions.akkaHttpExtensions))

  lazy val templates = Def.setting(Seq(
    "com.github.japgolly.scalacss" %%% "core" % Versions.scalaCSS,

    "com.github.japgolly.scalacss" %%% "ext-scalatags" % Versions.scalaCSS))

  lazy val facadeDependencies = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.dom,

    "org.querki" %%% "querki-jsext" % Versions.jsext //useful sclalajs extensions
    ))

  //scalajs libs
  lazy val sjsLibs = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.dom,

    "org.querki" %%% "jquery-facade" % Versions.jqueryFacade, //scalajs facade for jQuery + jQuery extensions

    "org.querki" %%% "querki-jsext" % Versions.jsext, //useful sclalajs extensions

    "org.denigma" %%% "codemirror-facade" % Versions.codemirrorFacade,

    "org.denigma" %%% "binding" % Versions.binding))

  //dependencies on javascript libs
  lazy val webjars = Def.setting(Seq(
    "org.webjars" % "jquery" % Versions.jquery,

    "org.webjars" % "Semantic-UI" % Versions.semanticUI, //css theme, similar to bootstrap

    "org.webjars" % "codemirror" % Versions.codemirror,

    "org.webjars" % "three.js" % Versions.threeJs))

  //common purpose libs
  lazy val commonShared: Def.Initialize[Seq[ModuleID]] = Def.setting(Seq( //"com.softwaremill.quicklens" %%% "quicklens" % Versions.quicklens//, //nice lenses for case classes
  ))
}
