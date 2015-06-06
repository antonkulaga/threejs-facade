threejs facade
==============

This if a facade of threejs library. All the code is inside threejs subproject.

Usage
=====

In order to resolve a lib you should add a resolver::
```scala
resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases") //add resolver
libraryDependencies += "org.scalajs" %%% "threejs-facade" % "0.0.71-0.1.5" //add dependency
```

Gettings started
----------------

You can see an example in preview subproject.

To run preview:
```sbt
    sbt //to opens sbt console
    re-start //Use this command **instead of** run to run the app
    Open localhost:5552 to see the result, it should reload whenever any sources are changed
```
