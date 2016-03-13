import com.typesafe.sbt.SbtNativePackager.autoImport._
import com.typesafe.sbt.gzip.Import.gzip
import com.typesafe.sbt.web.SbtWeb.autoImport._
import com.typesafe.sbt.web.pipeline.Pipeline
import com.typesafe.sbt.web.{PathMapping, SbtWeb}
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import playscalajs.PlayScalaJS
import sbt.Keys._
import sbt._
import spray.revolver.RevolverPlugin.autoImport._

lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug

lazy val publishSettings = Seq(
	bintrayRepository := "denigma-releases",

	bintrayOrganization := Some("denigma"),

	licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0")),

	bintrayPublishIvyStyle := true
)

val scalaJSDevStage  = Def.taskKey[Pipeline.Stage]("Apply fastOptJS on all Scala.js projects")

def scalaJSDevTaskStage: Def.Initialize[Task[Pipeline.Stage]] = Def.task { mappings: Seq[PathMapping] =>
	mappings ++ PlayScalaJS.devFiles(Compile).value ++ PlayScalaJS.sourcemapScalaFiles(fastOptJS).value
}


lazy val root = Project("root",file("."),settings = commonSettings)
	.settings(
		mainClass in Compile := (mainClass in backend in Compile).value,
		(fullClasspath in Runtime) += (packageBin in backend in Assets).value //to package production deps
	) dependsOn backend aggregate(backend, frontend)

// code shared between backend and frontend
lazy val shared = crossProject
  .crossType(CrossType.Pure)
  .in(file("preview/shared"))
  .settings(commonSettings: _*)
  .settings(name := "shared").disablePlugins(RevolverPlugin)
	  .jsConfigure(p=>p.enablePlugins(ScalaJSPlay))
lazy val sharedJVM = shared.jvm
lazy val sharedJS = shared.js

// Scala-Js preview frontend
lazy val frontend = project.in(file("preview/frontend"))
	.settings(commonSettings: _*)
	.settings(
	persistLauncher in Compile := true,
	persistLauncher in Test := false,
	jsDependencies += RuntimeDOM % "test",
	testFrameworks += new TestFramework("utest.runner.Framework"),
	libraryDependencies ++= Dependencies.sjsLibs.value++Dependencies.templates.value
).enablePlugins(ScalaJSPlay).dependsOn(sharedJS,facade).disablePlugins(RevolverPlugin)

//backend preview project
lazy val backend = Project("backend", file("preview/backend"),settings = commonSettings)
	.settings(
		libraryDependencies ++= Dependencies.akka.value++Dependencies.templates.value++Dependencies.webjars.value,
		mainClass in Compile :=Some("org.denigma.preview.Main"),
		scalaJSProjects := Seq(frontend),
		scalaJSDevStage := scalaJSDevTaskStage.value,
		//pipelineStages := Seq(scalaJSProd,gzip),
		(emitSourceMaps in fullOptJS) := true,
		pipelineStages in Assets := Seq(scalaJSDevStage, gzip), //for run configuration
		(fullClasspath in Runtime) += (packageBin in Assets).value //to package production deps
	).enablePlugins( SbtTwirl, SbtWeb, PlayScalaJS ) dependsOn sharedJVM disablePlugins RevolverPlugin



/**
 * For parts of the project that we will not publish
 */
lazy val noPublishSettings = Seq(
	publish := (),
	publishLocal := (),
	publishArtifact := false
)


//settings for all the projects
lazy val commonSettings = Seq(
	scalaVersion := Versions.scala,
	organization := "org.denigma",
	resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases"), //for scala-js-binding
	libraryDependencies ++= Dependencies.commonShared.value++Dependencies.testing.value,
	updateOptions := updateOptions.value.withCachedResolution(true) //to speed up dependency resolution
)

lazy val facade = Project("threejs", file("facade"))
	.settings(commonSettings ++ publishSettings: _*)
	.settings(
		name := "threejs-facade",
		version := Versions.threejsFacade,
		libraryDependencies ++= Dependencies.facadeDependencies.value
	) enablePlugins ScalaJSPlugin disablePlugins RevolverPlugin
