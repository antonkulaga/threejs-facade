object Versions extends WebJarsVersions with ScalaJSVersions with SharedVersions
{
	val scala = "2.12.1"

	val akkaHttpExtensions = "0.0.15"
}

trait ScalaJSVersions {

    val threejsFacade =  "0.0.77-0.1.8"

	val jqueryFacade = "1.0"

	val jsext = "0.8"

	val dom = "0.9.1"

	val codemirrorFacade = "5.22.0-0.8"

	val binding = "0.8.17"

	val scalaTest = "3.0.1"

}

// versions for libs that are shared between client and server
trait SharedVersions
{

	val scalaRx = "0.3.2"

	val scalaTags = "0.6.0"

	val scalaCSS = "0.5.1"

}


trait WebJarsVersions{

	val jquery =  "3.1.1"

	val semanticUI = "2.2.7"

	val threeJs = "r77"

	val codemirror = "5.22.0"
}

