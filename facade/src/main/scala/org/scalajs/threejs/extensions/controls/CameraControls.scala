package org.scalajs.threejs.extensions.controls

import org.scalajs.dom.MouseEvent

trait CameraControls {

  def onMouseDown(event: MouseEvent): Unit

  def onMouseMove(event: MouseEvent): Unit

  def onMouseUp(event: MouseEvent): Unit

  def onMouseWheel(event: MouseEvent): Unit

  def update(): Unit

  def enabled: Boolean

}

