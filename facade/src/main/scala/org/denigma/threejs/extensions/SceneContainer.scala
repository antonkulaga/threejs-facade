package org.denigma.threejs.extensions

import org.denigma.threejs.{ Scene, PerspectiveCamera, Renderer }
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

trait SceneContainer {

  def container: HTMLElement

  def width: Double

  def height: Double

  type RendererType <: Renderer

  lazy val scene = new Scene()

  def distance: Double = 2000

  lazy val renderer: RendererType = this.initRenderer()

  lazy val camera = initCamera()

  def aspectRatio: Double = width / height

  protected def initRenderer(): RendererType

  protected def initCamera() =
    {
      val fov = 40
      val near = 1
      val far = 1000000
      val camera = new PerspectiveCamera(fov, this.aspectRatio, near, far)
      camera.position.z = distance
      camera
    }

  protected def onEnterFrameFunction(double: Double): Unit = {
    onEnterFrame()
    render()
  }

  def onEnterFrame(): Unit = {
    renderer.render(scene, camera)
  }

  def render(): Int = dom.window.requestAnimationFrame(onEnterFrameFunction _)

}

