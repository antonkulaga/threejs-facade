three.js facade
==============

[![Build Status](https://travis-ci.org/zikolach/threejs-facade.svg?branch=0.0.88-0.1.9)](https://travis-ci.org/zikolach/threejs-facade)

This is a Scala.js facade of three.js javascript 3D library (http://threejs.org/). 
All the code is inside facade folder (threejs subproject). 

Usage
=====

In order to resolve a lib you should add a resolver::
```sbtshell
resolvers += sbt.Resolver.bintrayRepo("scalajs-facades", "scalajs-facades-releases") //add resolver
libraryDependencies += "org.scalajs" %%% "threejs-facade" % "0.0.88-0.1.9" //add dependency
```

Gettings started
----------------

You can see an example in preview subproject.

To run preview:
```bash
    sbt fastOptJS
    open index.html
```