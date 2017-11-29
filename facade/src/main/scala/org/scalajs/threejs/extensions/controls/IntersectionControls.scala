package org.scalajs.threejs.extensions.controls

import org.scalajs.threejs._
import org.scalajs.dom

trait IntersectionControls {
  def camera: Camera
  def scene: Object3D

  lazy val raycaster = new Raycaster()

  var intersections = List.empty[Intersection]
  var underMouse = Map.empty[Object3D, List[Intersection]]
  var last = Map.empty[Object3D, List[Intersection]]
  var exit = Map.empty[Object3D, List[Intersection]]
  var enter = Map.empty[Object3D, List[Intersection]]

  def findIntersections(x: Double, y: Double): List[Intersection] =
    {
      val vector = new Vector3(x, y, 1)
      raycaster.setFromCamera(vector, camera)
      raycaster.intersectObjects(scene.children).sortWith((a, b) => a.point.distanceTo(vector) < b.point.distanceTo(vector)).toList
    }

  def onCursorMove(cordX: Double, cordY: Double, width: Double, height: Double): Unit = {
    val mouseX = 2 * cordX / width - 1
    val mouseY = -2 * cordY / height + 1 // scalastyle:ignore
    intersections = findIntersections(mouseX, mouseY)
    underMouse = intersections.groupBy(_.`object`)
    val l = last // if I do not do this assigment and use last instead of l I get into trouble
    this.exit = l.filterKeys(!underMouse.contains(_))
    this.enter = underMouse.filterKeys(!l.contains(_))
    // if(exit.exists{case (key,value)=>enter.contains(key)}) dom.console.error("same enterexit")
    val s = enter.size
    last = underMouse
    if (s != enter.size) dom.console.error("ScalaJS error with immutable collections")
  }

}
