package org.scalajs.threejs.extras

import org.scalajs.threejs.{Camera, Vector2, Vector3}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.TrackballControls")
class TrackBallControls(camera: Camera) extends js.Object {

  def getMouseOnScreen(clientX: Double, clientY: Double): Vector2 = js.native

  def getMouseProjectionOnBall(clientX: Double, clientY: Double): Vector3 = js.native

  def rotateCamera(): Unit = js.native

  def zoomCamera(): Unit = js.native

  def panCamera(): Unit = js.native

  def update(): Unit = js.native

  def keydown(event: dom.KeyboardEvent): Unit = js.native

  def keyup(event: dom.KeyboardEvent): Unit = js.native

  def mousedown(event: dom.MouseEvent): Unit = js.native

  def mouseup(event: dom.MouseEvent): Unit = js.native

  def mousmove(event: dom.MouseEvent): Unit = js.native

}
