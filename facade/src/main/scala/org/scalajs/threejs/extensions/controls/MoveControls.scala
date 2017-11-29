package org.scalajs.threejs.extensions.controls

import org.scalajs.threejs.Vector2
import org.scalajs.dom
import org.scalajs.dom.raw.MouseEvent

import scala.scalajs.js

trait MoveControls extends CameraControls {

  var minDistance = 0
  var maxDistance = Double.MaxValue //infinity?

  protected def computeMove(event: MouseEvent): Unit ={
  }
}
