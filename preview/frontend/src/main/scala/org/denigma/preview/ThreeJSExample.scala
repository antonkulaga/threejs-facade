package org.denigma.preview

import org.denigma.codemirror.{CodeMirror, EditorConfiguration}
import org.denigma.codemirror.extensions.EditorConfig
import org.denigma.threejs._
import org.denigma.threejs.extensions.Container3D
import org.denigma.threejs.extensions.controls.{CameraControls, JumpCameraControls}
import org.denigma.threejs.extras.HtmlSprite
import org.scalajs.dom
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.raw.{HTMLTextAreaElement, HTMLElement}

import scala.scalajs.js
import scala.util.Random
import scalatags.JsDom.all._

import org.denigma.codemirror.{CodeMirror, EditorConfiguration}
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLTextAreaElement


object Example extends CodeExample
{

  def activate(): Unit = {
    val el: HTMLElement = dom.document.getElementById("container").asInstanceOf[HTMLElement]
    val demo = new ExampleScene(el, 1280, 500)
    demo.render()
    activateCode()
  }
}

class CodeExample extends ExampleData
{

  def activateCode(): Unit = {
    activateCode("scala", "clike", scalaCode)
    activateCode("html", "htmlmixed", htmlCode)
  }

  def activateCode(id: String, mode: String, code: String): Unit = {
    val params:EditorConfiguration =EditorConfig.mode(mode).lineNumbers(true).value(code)
    val editor = dom.document.getElementById(id) match {
      case el:HTMLTextAreaElement =>
        val m = CodeMirror.fromTextArea(el,params)
        m.getDoc().setValue(code)
      case _=> dom.console.error("cannot find text area for the code!")
    }

  }
}

class ExampleScene(val container: HTMLElement, val width: Double, val height: Double) extends Container3D
{
  val geometry = new BoxGeometry( 350, 300, 250 )


  val colors = List("green","red","blue","orange","purple","teal")
  val colorMap= Map("green"->0xA1CF64,"red"->0xD95C5C,"blue" -> 0x6ECFF5,"orange" ->0xF05940,"purple"->0x564F8A,"teal"->0x00B5AD)

  def materialParams(name: String) = js.Dynamic.literal(
    color = new Color(colorMap(name))
   // wireframe = true
  ).asInstanceOf[MeshLambertMaterialParameters]

  def randColorName = colors(Random.nextInt(colors.size))

  protected def nodeTagFromTitle(title: String, colorName: String) =  textarea(title,`class`:=s"ui large ${colorName} message").render


  var meshes = addMesh(new Vector3(0,0,0))::addMesh(new Vector3(400,0,200))::addMesh(new Vector3(-400,0,200))::Nil

  var sprites = List.empty[HtmlSprite]

  override val controls:CameraControls = new ExampleControls(camera,this.container,scene,width,height,this.meshes.head.position.clone())

  val light = new DirectionalLight( 0xffffff, 2 )
  light.position.set( 1, 1, 1 ).normalize()
  scene.add( light )


  def addMesh(pos:Vector3 = new Vector3()) = {
    val material = new MeshLambertMaterial( this.materialParams(randColorName) )
    val mesh: Mesh = new Mesh( geometry, material )
    mesh.name = pos.toString
    mesh.position.set(pos.x,pos.y,pos.z)
    mesh
  }

  def addLabel(pos:Vector3,title:String = "hello three.js and ScalaJS!") = {
    val helloHtml = nodeTagFromTitle(title,randColorName)
    val html = new HtmlSprite(helloHtml)
    html.position.set(pos.x,pos.y,pos.z)
    html
  }

  meshes.foreach(scene.add)
  meshes.zipWithIndex.foreach{case (m,i)=>
    this.sprites =  addLabel(m.position.clone().setY(m.position.y+200),"Text #"+i)::this.sprites

  }
  sprites.foreach(cssScene.add)

}

/**
 * Just shows that some effects are working
 * @param cam
 * @param el
 * @param sc
 * @param center
 */
class ExampleControls(cam: Camera, el: HTMLElement, sc: Scene, width: Double, height: Double, center: Vector3 = new Vector3()) extends JumpCameraControls(cam, el, sc, width, height, center)
{
  import org.querki.jquery._

  lazy  val $el = $(el)


  override def onMouseMove(event:MouseEvent) = {
    val (offsetX,offsetY) = ($el.offset().left,$el.offset().top)
    this.onCursorMove(event.clientX-offsetX,event.clientY-offsetY,width,height)

    enter.keys.foreach{
        case m:Mesh=>
          m.material match
          {
            case mat: MeshLambertMaterial=>      mat.wireframe = true
            case _=> //do nothing
          }

        case _ => //do nothing
    }

    exit.keys.foreach{
      case m: Mesh=>
        m.material match
        {
          case mat: MeshLambertMaterial=>      mat.wireframe = false
          case _=> //do nothing
        }

      case _ => //do nothing
    }

    rotateOnMove(event)

  }


}


trait ExampleData{

  lazy val scalaCode =
    """
      |object Example
      |{
      |  def activate(): Unit = {
      |    //get html container for 3d scence
      |    val el:HTMLElement = dom.document.getElementById("container").asInstanceOf[HTMLElement]
      |    val demo = new ExampleScene(el,1280,768) //set the size of the canvas
      |    demo.render() //render
      |  }
      |}
      |
      |class ExampleScene(val container:HTMLElement, val width:Double, val height:Double) extends Container3D
      |{
      |  val geometry = new BoxGeometry( 350, 300, 250 )
      |  val colors = List("green","red","blue","orange","purple","teal")
      |  val colorMap= Map("green"->0xA1CF64,"red"->0xD95C5C,"blue" -> 0x6ECFF5,"orange" ->0xF05940,"purple"->0x564F8A,"teal"->0x00B5AD)
      |
      |  def materialParams(name:String) = js.Dynamic.literal(
      |    color = new Color(colorMap(name))
      |   // wireframe = true
      |  ).asInstanceOf[MeshLambertMaterialParameters]
      |
      |  def randColorName = colors(Random.nextInt(colors.size))
      |
      |  protected def nodeTagFromTitle(title:String,colorName:String) =  textarea(title,`class`:=s"ui large ${colorName} message").render
      |
      |  var meshes = addMesh(new Vector3(0,0,0))::addMesh(new Vector3(400,0,200))::addMesh(new Vector3(-400,0,200))::Nil //test meshes
      |
      |  var sprites = List.empty[HtmlSprite] //test sprite
      |
      |  override val controls:CameraControls = new ExampleControls(camera,this.container,scene,width,height,this.meshes.head.position.clone())
      |
      |  val light = new DirectionalLight( 0xffffff, 2 )
      |  light.position.set( 1, 1, 1 ).normalize()
      |  scene.add( light )
      |
      |  def addMesh(pos:Vector3 = new Vector3()) = {
      |    val material = new MeshLambertMaterial( this.materialParams(randColorName) )
      |    val mesh: Mesh = new Mesh( geometry, material )
      |    mesh.name = pos.toString
      |    mesh.position.set(pos.x,pos.y,pos.z)
      |    mesh
      |  }
      |
      |  def addLabel(pos:Vector3,title:String = "hello three.js and ScalaJS!") = {
      |    val helloHtml = nodeTagFromTitle(title,randColorName)
      |    val html = new HtmlSprite(helloHtml)
      |    html.position.set(pos.x,pos.y,pos.z)
      |    html
      |  }
      |
      |  meshes.foreach(scene.add)
      |  meshes.zipWithIndex.foreach{case (m,i)=>
      |    this.sprites =  addLabel(m.position.clone().setY(m.position.y+200),"Text #"+i)::this.sprites //for each box add label on top
      |  }
      |  sprites.foreach(cssScene.add) //we have separate scence for Sprites and other html elements in 3D
      |
      |}
    """.stripMargin


  lazy val htmlCode ="""<section class="ui blue pilled message">
                       |    ScalaJS interface for THREE.js javascript lib. You can rotate the cube and sprite by holding left mouse button
                       |</section>
                       |<section id="container">
                       |""".stripMargin


}