object Versions extends WebJarsVersions with ScalaJSVersions with SharedVersions
{
	val scala = "2.11.8"

	val akkaHttpExtensions = "0.0.10"
}

trait ScalaJSVersions {

  val threejsFacade =  "0.0.74-0.1.6"

	val jqueryFacade = "1.0-RC2"

	val jsext = "0.6"

	val dom = "0.9.0"

	val codemirrorFacade = "5.11-0.7"

	val binding = "0.8.1"

	val scalaTest = "3.0.0-SNAP13"

}

//versions for libs that are shared between client and server
trait SharedVersions
{

	val scalaRx = "0.3.0"

	val scalaTags = "0.5.1"

	val scalaCSS = "0.4.0"

}


trait WebJarsVersions{

	val jquery =  "2.2.1"

	val semanticUI = "2.1.8"

	val threeJs = "r74"

	val codemirror = "5.12"
}

