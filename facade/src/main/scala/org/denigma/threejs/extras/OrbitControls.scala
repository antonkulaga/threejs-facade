package org.denigma.threejs.extras

import org.denigma.threejs.{ Vector3, Camera }
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.OrbitControls")
class OrbitControls(camera: Camera, element: HTMLElement) extends js.Object {

  def this(camera: Camera) = this(camera, null) // scalastyle:ignore

  def rotateLeft(angle: Double): Unit = js.native

  def rotateRight(angle: Double): Unit = js.native

  def rotateUp(angle: Double): Unit = js.native

  def rotateDown(angle: Double): Unit = js.native

  def zoomIn(zoomScale: Double): Unit = js.native

  def zoomOut(zoomScale: Double): Unit = js.native

  def pan(distance: Vector3): Unit = js.native

  def update(): Unit = js.native

  def getAutoRotationAngle(): Double = js.native

  def getZoomScale(): Double = js.native

  def onMouseDown(event: dom.MouseEvent): Unit = js.native

  def onMouseUp(event: dom.MouseEvent): Unit = js.native

  def onMouseWheel(event: dom.MouseEvent): Unit = js.native

  def onMouseMove(event: dom.MouseEvent): Unit = js.native

  def onKeyDown(event: dom.KeyboardEvent): Unit = js.native

  def onKeyUp(event: dom.KeyboardEvent): Unit = js.native

}
