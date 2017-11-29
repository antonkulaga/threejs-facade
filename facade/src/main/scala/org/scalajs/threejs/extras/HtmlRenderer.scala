package org.scalajs.threejs.extras

import org.scalajs.threejs.{Camera, Matrix3, Object3D, Renderer}
import org.scalajs.dom.raw.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.CSS3DSprite")
class HtmlSprite(val element: Element) extends HtmlObject(element)

@js.native
@JSGlobal("THREE.CSS3DObject")
class HtmlObject(element: Element) extends Object3D

@js.native
@JSGlobal("THREE.CSS3DRenderer")
class HtmlRenderer extends Renderer {

  //  def render(scene: Scene, camera: Camera): Unit = js.native
  //  def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  //  var domElement: HTMLCanvasElement = js.native
  // def this(parameters: WebGLRendererParameters = js.native) = this()

  def setSize(width: Double, height: Double): Unit = js.native

  def epsilon(value: Double): Double = js.native

  def getObjectCSSMatrix(matrix: Matrix3): String = js.native

  def getCameraCSSMatrix(matrix: Matrix3): String = js.native

  def renderObject(obj: HtmlObject, camera: Camera): Unit = js.native

}
