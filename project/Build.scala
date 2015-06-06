import com.typesafe.sbt.SbtNativePackager.autoImport._
import com.typesafe.sbt.web.SbtWeb
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._
import bintray._
import BintrayPlugin.autoImport._
import spray.revolver.RevolverPlugin._
import play.twirl.sbt._
import play.twirl.sbt.SbtTwirl.autoImport._
import com.typesafe.sbt.web.SbtWeb.autoImport._


object Build extends PreviewBuild {

	lazy val root = Project("root",file("."),settings = commonSettings)
		.settings(
			mainClass in Compile := (mainClass in backend in Compile).value,
			libraryDependencies += "com.lihaoyi" % "ammonite-repl" % Versions.ammonite cross CrossVersion.full,
			initialCommands in console := """ammonite.repl.Repl.run("")""" //better console
		) dependsOn backend aggregate(backend,frontend)
}

class PreviewBuild extends FacadeBuild
{
	// code shared between backend and frontend
	lazy val shared = crossProject
	  .crossType(CrossType.Pure)
	  .in(file("preview/shared"))
	  .settings(commonSettings: _*)
	  .settings(name := "shared")
	lazy val sharedJVM = shared.jvm
	lazy val sharedJS = shared.js

	// Scala-Js preview frontend
	lazy val frontend = Project("frontend", file("preview/frontend"))
		.settings(commonSettings: _*)
		.settings(
		persistLauncher in Compile := true,
		persistLauncher in Test := false,
		jsDependencies += RuntimeDOM % "test",
		testFrameworks += new TestFramework("utest.runner.Framework"),
		libraryDependencies ++= Dependencies.sjsLibs.value++Dependencies.templates.value
	).enablePlugins(ScalaJSPlugin).dependsOn(sharedJS,facade)

	//backend preview project
	lazy val backend = Project("backend", file("preview/backend"),settings = commonSettings++Revolver.settings)
		.settings(
			libraryDependencies ++= Dependencies.akka.value++Dependencies.templates.value++Dependencies.webjars.value,
				mainClass in Compile :=Some("org.denigma.preview.Main"),
        mainClass in Revolver.reStart := Some("org.denigma.preview.Main"),
        resourceGenerators in Compile <+=  (fastOptJS in Compile in frontend,
				  packageScalaJSLauncher in Compile in frontend) map( (f1, f2) => Seq(f1.data, f2.data)),
			watchSources <++= (watchSources in frontend),
      (managedClasspath in Runtime) += (packageBin in Assets).value
		).enablePlugins(SbtTwirl,SbtWeb) dependsOn sharedJVM

}

class FacadeBuild  extends sbt.Build{
	self=>

	protected lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug

	lazy val publishSettings = Seq(
		bintrayRepository := "denigma-releases",

		bintrayOrganization := Some("denigma"),

		licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0")),

		bintrayPublishIvyStyle := true
	)

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
		.settings(commonSettings++publishSettings: _*)
		.settings(
			name := "threejs-facade",
			version := Versions.threejsFacade,
			libraryDependencies ++= Dependencies.facadeDependencies.value
		) enablePlugins ScalaJSPlugin

}
