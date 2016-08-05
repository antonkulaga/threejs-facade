package org.denigma.threejs.extensions.controls

import org.denigma.threejs.Vector2
import org.scalajs.dom
import org.scalajs.dom.raw.MouseEvent

import scala.scalajs.js

trait ZoomControls extends CameraControls {

  var enabled = true

  var userZoom = true
  var userZoomSpeed = 1.0

  var minDistance = 0
  var maxDistance = Double.MaxValue //infinity?

  protected var zoomStart = new Vector2()
  protected var zoomEnd = new Vector2()
  protected var zoomDelta = new Vector2()

  var scale: Double = 1.0

  def zoomScale(): Double = Math.pow(0.95, userZoomSpeed)

  def zoomIn(zScale: Double = this.zoomScale()): Unit = scale /= zScale
  def zoomOut(zScale: Double = this.zoomScale()): Unit = scale *= zScale

  def onMouseWheel(event: dom.MouseEvent) = if (enabled && userZoom) {
    var delta = 0
    val wheel = event.asInstanceOf[js.Dynamic]
    if (!js.isUndefined(wheel.wheelDelta)) { // WebKit / Opera / Explorer 9
      delta = wheel.wheelDelta.asInstanceOf[Int]
    } else if (!js.isUndefined(wheel.detail)) { // Firefox
      delta = -event.detail
    }
    if (delta > 0) zoomOut() else zoomIn()
  }

  protected def computeZoom(event: MouseEvent): Unit ={

    zoomEnd.set(event.clientX, event.clientY)
    zoomDelta.subVectors(zoomEnd, zoomStart)

    if (zoomDelta.y > 0) zoomIn() else zoomOut()

    zoomStart.copy(zoomEnd)
  }
}
