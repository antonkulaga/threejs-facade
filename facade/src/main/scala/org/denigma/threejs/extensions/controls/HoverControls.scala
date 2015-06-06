package org.denigma.threejs.extensions.controls

import org.denigma.threejs.{Vector2, Vector3, Camera}
import org.scalajs.dom
import HoverControls.HoverState
import org.scalajs.dom.raw.{Event, MouseEvent, HTMLElement}

import scala.scalajs.js


object HoverControls {


  class HoverState
  case object Zoom extends HoverState
  case object Rotate extends HoverState
  case object Pan extends HoverState
  case object Calm extends HoverState

}



class HoverControls(camera:Camera, element:HTMLElement, val center:Vector3 = new Vector3()) extends RotateControls
{



  var enabled = true

  var userZoom = true
  var userZoomSpeed = 1.0

  var userRotate = true
  var userRotateSpeed = 1.0

  var userPan = true
  var userPanSpeed = 2.0

  var autoRotate = false
  var autoRotateSpeed = 2.0 // 30 seconds per round when fps is 60

  var minPolarAngle = 0 // radians
  var maxPolarAngle = Math.PI // radians

  var minDistance = 0
  var maxDistance =  Double.MaxValue //infinity?


  object Keys {

    val LEFT = 37
    val UP = 38
    val RIGHT = 39
    val BOTTOM = 40
    val ROTATE = 65
    val ZOOM = 83
    val PAN = 68
  }

  protected var EPS = 0.000001
  protected var PIXELS_PER_ROUND = 1800

  protected var rotateStart = new Vector2()
  protected var rotateEnd = new Vector2()
  protected var rotateDelta = new Vector2()

  protected var zoomStart = new Vector2()
  protected var zoomEnd = new Vector2()
  protected var zoomDelta = new Vector2()

  protected var phiDelta:Double = 0
  protected var thetaDelta:Double = 0
  var scale: Double = 1.0

  var lastPosition = new Vector3()

  def autoRotationAngle(): Double =  2 * Math.PI / 60 / 60 * autoRotateSpeed

  def zoomScale(): Double =    Math.pow( 0.95, userZoomSpeed )



  var state:HoverState = HoverControls.Calm



  def rotateLeft( angle:Double = autoRotationAngle() ): Unit =   thetaDelta -= angle
  def rotateRight( angle:Double = autoRotationAngle() ): Unit =   thetaDelta += angle
  def rotateUp( angle:Double = autoRotationAngle() ): Unit =   phiDelta -= angle
  def rotateDown( angle:Double = autoRotationAngle() ): Unit =   phiDelta += angle
  def zoomIn(zScale:Double = this.zoomScale()): Unit = scale /= zScale
  def zoomOut(zScale:Double = this.zoomScale()): Unit = scale *= zScale


  def pan(distance:Vector3): Vector3 = {
    distance.transformDirection( this.camera.matrix )
    distance.multiplyScalar( userPanSpeed )
    camera.position.add( distance )
    this.center.add( distance )
  }


  def update() =  {


    var offset = camera.position.clone().sub( this.center )

    // angle from z-axis around y-axis

    var theta = Math.atan2( offset.x, offset.z )

    // angle from y-axis

    var phi = Math.atan2( Math.sqrt( offset.x * offset.x + offset.z * offset.z ), offset.y )

    if ( this.autoRotate ) {

      //this.rotateLeft( getAutoRotationAngle() )

    }

    theta = theta + thetaDelta
    phi = phi + phiDelta

    // restrict phi to be between desired limits
    phi = Math.max( this.minPolarAngle, Math.min( this.maxPolarAngle, phi ) )

    // restrict phi to be betwee EPS and PI-EPS
    phi = Math.max( EPS, Math.min( Math.PI - EPS, phi ) ) //TODO: change

    var radius = offset.length() * scale

    // restrict radius to be between desired limits
    radius = Math.max( this.minDistance, Math.min( this.maxDistance, radius ) )

    offset.x = radius * Math.sin( phi ) * Math.sin( theta )
    offset.y = radius * Math.cos( phi )
    offset.z = radius * Math.sin( phi ) * Math.cos( theta )

    camera.position.copy( this.center ).add( offset )
    camera.lookAt( this.center )

    thetaDelta = 0
    phiDelta = 0
    scale = 1

    if ( lastPosition.distanceTo( this.camera.position ) > 0 ) {

      //this.dispatchEvent( changeEvent )

      lastPosition.copy( camera.position )

    }

  }


  def onMouseDown( event:MouseEvent ) = if(userRotate && enabled){

    //event.preventDefault()
    if(state == HoverControls.Calm)
      state = event.button match
      {
        case 0=>HoverControls.Rotate
        case 1=>HoverControls.Zoom
        case 2=>HoverControls.Pan
      }

    state match {
      case HoverControls.Rotate=>
        rotateStart.set(event.clientX,event.clientY)

      case HoverControls.Zoom=>zoomStart.set(event.clientX,event.clientY)

      case HoverControls.Pan=> //nothing

      case _=> //nothing

    }


  }

  def mouseRotate(clientX:Double,clientY:Double) = {

    rotateEnd.set( clientX, clientY )
    rotateDelta.subVectors( rotateEnd, rotateStart )

    val rLeft = 2 * Math.PI * rotateDelta.x / PIXELS_PER_ROUND * userRotateSpeed
    val rUp = 2 * Math.PI * rotateDelta.y / PIXELS_PER_ROUND * userRotateSpeed

    rotateLeft( rLeft)
    rotateUp( rUp )

    rotateStart.copy( rotateEnd )

  }

  def rotateOnMove(event:MouseEvent) = if(enabled && userRotate){
    state match {
      case HoverControls.Rotate=>

        mouseRotate( event.clientX, event.clientY )

      case HoverControls.Zoom=>

        zoomEnd.set( event.clientX, event.clientY )
        zoomDelta.subVectors( zoomEnd, zoomStart )

        if ( zoomDelta.y > 0 ) zoomIn()  else zoomOut()

        zoomStart.copy( zoomEnd )
      case HoverControls.Pan=>
        val evd = event.asInstanceOf[js.Dynamic]
        val movementX:Double = evd.movementX.asInstanceOf[Double]
        val movementY:Double = evd.movementY.asInstanceOf[Double]
        this.pan(new Vector3(-movementX,movementY,0))
      //TODO: test how it works
      //var movementX = event.movementX || event.mozMovementX || event.webkitMovementX || 0;
      //var movementY = event.movementY || event.mozMovementY || event.webkitMovementY || 0;
      //this.pan( new Vector3( - movementX, movementY, 0 ) )
      case _=> //do nothing
    }
  }

  def onMouseMove(event:MouseEvent) =
  {
    rotateOnMove(event)

  }

  def onContextMenu(event:Event):js.Any = {
    event.preventDefault()
    false
  }

  def onMouseUp( event:MouseEvent ):Unit = if(enabled && userRotate){
    state = HoverControls.Calm
  }

  def onMouseWheel(event:dom.MouseEvent) = if(enabled && userZoom) {
    var delta = 0
    val wheel = event.asInstanceOf[js.Dynamic]
    if (!js.isUndefined(wheel.wheelDelta)){ // WebKit / Opera / Explorer 9
      delta = wheel.wheelDelta.asInstanceOf[Int]
    }
    else if (!js.isUndefined(wheel.detail)) { // Firefox
      delta = - event.detail
    }
    if ( delta > 0 )    zoomOut() else   zoomIn()

  }



  def attach(el:HTMLElement) = {

    el.addEventListener( "mousedown", (this.onMouseDown _).asInstanceOf[Function[Event,_ ]] )
    el.addEventListener( "mousemove", (this.onMouseMove _).asInstanceOf[Function[Event,_ ]], false )
    el.addEventListener( "mouseup", (this.onMouseUp _).asInstanceOf[Function[Event,_ ]], false )
    el.addEventListener( "mousewheel", (this.onMouseWheel _).asInstanceOf[Function[Event,_ ]] )
    el.addEventListener( "DOMMouseScroll", (this.onMouseWheel _).asInstanceOf[Function[Event,_ ]], false ) // firefox
    el.addEventListener( "contextmenu", (this.onContextMenu _).asInstanceOf[Function[Event,_ ]], false )

  }


  this.attach(element)
}


