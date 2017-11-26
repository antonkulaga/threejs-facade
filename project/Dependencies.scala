import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object Dependencies {
  lazy val templates = Def.setting(Seq(
    "com.github.japgolly.scalacss" %%% "core" % Versions.scalaCSS,
    "com.github.japgolly.scalacss" %%% "ext-scalatags" % Versions.scalaCSS
  ))

  lazy val facadeDependencies = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.dom,
    "org.querki" %%% "querki-jsext" % Versions.jsext //useful sclalajs extensions
  ))

  lazy val sjsLibs = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.dom
  ))
}
