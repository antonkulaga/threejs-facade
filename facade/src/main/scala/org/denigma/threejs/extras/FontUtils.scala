package org.denigma.threejs.extras.geometries

import scalajs.js
import scalajs.js.annotation._
import org.denigma.threejs._

@js.native
@JSName("THREE.FontUtils")
object FontUtils extends js.Object {
  var faces: js.Any = js.native
  var face: String = js.native
  var weight: String = js.native
  var style: String = js.native
  var size: Double = js.native
  var divisions: Double = js.native
  def getFace(): Face3 = js.native
  def loadFace(data: TypefaceData): TypefaceData = js.native
  def drawText(text: String): js.Any = js.native
  def extractGlyphPoints(c: String, face: Face3, scale: Double, offset: Double, path: Path): js.Any = js.native
  def generateShapes(text: String, parameters: js.Any = js.native): js.Array[Shape] = js.native
  var Triangulate: js.Any = js.native
}
