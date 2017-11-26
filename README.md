threejs facade
==============

This is a ScalaJS facade of ThreeJS javascript 3D library (http://threejs.org/). 
All the code is inside facade folder (facade subproject). 

Usage
=====

In order to resolve a lib you should add a resolver::
```scala
resolvers += sbt.Resolver.bintrayRepo("scalajs-facades", "scalajs-facades-releases") //add resolver
libraryDependencies += "org.scalajs" %%% "threejs-facade" % "0.0.77-0.1.8" //add dependency
```

Gettings started
----------------

You can see an example in preview subproject.

To run preview:
```bash
    sbt fastOptJS
    open index.html
```