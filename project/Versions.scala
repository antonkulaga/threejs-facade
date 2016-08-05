object Versions extends WebJarsVersions with ScalaJSVersions with SharedVersions
{
	val scala = "2.11.8"

	val akkaHttpExtensions = "0.0.13"
}

trait ScalaJSVersions {

  val threejsFacade =  "0.0.77-0.1.7"

	val jqueryFacade = "1.0-RC6"

	val jsext = "0.7"

	val dom = "0.9.1"

	val codemirrorFacade = "5.13.2-0.7"

	val binding = "0.8.13"

	val scalaTest = "3.0.0"

}

// versions for libs that are shared between client and server
trait SharedVersions
{

	val scalaRx = "0.3.1"

	val scalaTags = "0.6.0"

	val scalaCSS = "0.4.1"

}


trait WebJarsVersions{

	val jquery =  "3.1.0"

	val semanticUI = "2.2.2"

	val threeJs = "r77"

	val codemirror = "5.13.2"
}

