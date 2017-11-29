package org.scalajs.treejs.preview

import org.scalajs.dom.{document, window}
import org.scalajs.threejs._
import org.scalajs.threejs.extras.OrbitControls

object PreviewApp {
  def main(args: Array[String]): Unit = {
    animate(init())()
  }

  def init(): () => Unit = {
    val camera = new PerspectiveCamera(70, window.innerWidth / window.innerHeight, 1, 1000)
    camera.position.y = 150
    camera.position.z = 500
    val scene = new Scene()
    val geometry = new BoxGeometry(200, 200, 200)
    for (i <- 0 until geometry.faces.length by 2) {
      val hex = Math.random() * 0xffffff
      geometry.faces(i).color.setHex(hex)
      geometry.faces(i + 1).color.setHex(hex)
    }
    val material = new MeshBasicMaterial()
    material.vertexColors = THREE.FaceColors
    material.overdraw = 0.5
    val cube = new Mesh(geometry, material)
    scene.add(cube)
    var renderer = new WebGLRenderer()
    renderer.devicePixelRatio = window.devicePixelRatio
    renderer.setSize(window.innerWidth, window.innerHeight)
    document.body.appendChild(renderer.domElement)

    window.onresize = _ => {
      val windowHalfX = window.innerWidth / 2
      val windowHalfY = window.innerHeight / 2
      camera.aspect = window.innerWidth / window.innerHeight
      camera.updateProjectionMatrix()
      renderer.setSize(window.innerWidth, window.innerHeight)
    }

    new OrbitControls(camera, document.body)

    () => {
      scene.children.head.rotation.y += 0.02
      scene.children.head.rotation.x += 0.005
      renderer.render(scene, camera)
    }
  }

  def animate(render: () => Unit)(timestamp: Double = 0): Unit = {
    window.requestAnimationFrame(animate(render) _)
    render()
  }
}
