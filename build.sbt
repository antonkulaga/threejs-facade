import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug

// ScalaJS preview
lazy val preview = project.in(file("preview"))
  .settings(commonSettings: _*)
  .settings(
    publish := (),
    publishLocal := (),
    publishArtifact := false,
    scalaJSUseMainModuleInitializer in Compile := true,
    scalaJSUseMainModuleInitializer in Test := false,
    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    libraryDependencies ++= Dependencies.sjsLibs.value ++ Dependencies.templates.value
  )
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(facade)

lazy val commonSettings = Seq(
  scalaVersion := Versions.scala,
  crossScalaVersions := Seq("2.11.11", "2.12.4"),
  organization := "org.scalajs",
  updateOptions := updateOptions.value.withCachedResolution(true) //to speed up dependency resolution
)

lazy val facade = Project("threejs", file("facade"), settings = commonSettings)
  .settings(
    name := "threejs-facade",
    version := Versions.threejsFacade,
    libraryDependencies ++= Dependencies.facadeDependencies.value,
    bintrayOrganization := Some("scalajs-facades"),
    bintrayRepository := "scalajs-facades-releases",
    licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0")),
    bintrayPublishIvyStyle := true
  )
  .enablePlugins(ScalaJSPlugin)

lazy val root = Project("root", file("."), settings = commonSettings)
  .settings(
    publish := (),
    publishLocal := (),
    publishArtifact := false,
    mainClass in Compile := (mainClass in preview in Compile).value
  )
  .dependsOn(preview)
  .aggregate(preview, facade)
