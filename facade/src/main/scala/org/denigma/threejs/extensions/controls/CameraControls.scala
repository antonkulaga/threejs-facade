package org.denigma.threejs.extensions.controls

import org.denigma.threejs.Vector3
import org.scalajs.dom.MouseEvent

trait CameraControls {

  def onMouseDown( event:MouseEvent ):Unit
  def onMouseMove( event:MouseEvent ):Unit
  def onMouseUp( event:MouseEvent ):Unit
  def onMouseWheel( event:MouseEvent ):Unit

  def update():Unit

  def enabled:Boolean

}

trait RotateControls extends CameraControls{
  val center:Vector3
  def rotateLeft( angle:Double  ): Unit
  def rotateRight( angle:Double  ): Unit
  def rotateUp( angle:Double  ): Unit
  def rotateDown( angle:Double  ): Unit

  def zoomIn(zScale:Double ): Unit
  def zoomOut(zScale:Double): Unit

  def pan(distance:Vector3): Vector3
}