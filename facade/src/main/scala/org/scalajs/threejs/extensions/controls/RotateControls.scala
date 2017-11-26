package org.scalajs.threejs.extensions.controls

import org.scalajs.threejs.Vector3

trait RotateControls extends  ZoomControls{
  val center: Vector3
  def rotateLeft(angle: Double): Unit
  def rotateRight(angle: Double): Unit
  def rotateUp(angle: Double): Unit
  def rotateDown(angle: Double): Unit
  def pan(distance: Vector3): Vector3
}
