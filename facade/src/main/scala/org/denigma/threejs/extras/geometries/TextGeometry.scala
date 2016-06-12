package org.denigma.threejs.extras.geometries

import scalajs.js
import scalajs.js.annotation._
import org.denigma.threejs._

@js.native
@JSName("THREE.TextGeometry")
class TextGeometry extends ExtrudeGeometry {
  def this(text: String, TextGeometryParameters: TextGeometryParameters = js.native) = this()
}
