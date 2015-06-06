package org.denigma.preview

import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import org.denigma.preview.templates.MyStyles
import play.twirl.api.Html

import scalacss.Defaults._

/**
 * Trait that countains routes and handlers
 */
trait Routes extends  PJax{

  lazy val webjarsPrefix = "lib"

  lazy val resourcePrefix = "resources"

  def index =  pathSingleSlash{ctx=>
    ctx.complete {
      HttpResponse(  entity = HttpEntity(MediaTypes.`text/html`, html.index(None).body  ))
    }
  }

  def mystyles =    path("styles" / "mystyles.css"){
    complete  {
      HttpResponse(  entity = HttpEntity(MediaTypes.`text/css`,  MyStyles.render   ))   }
  }

  def loadResources = pathPrefix(resourcePrefix~Slash) {
    getFromResourceDirectory("")
  }

  def webjars =pathPrefix(webjarsPrefix ~ Slash)  {  getFromResourceDirectory(webjarsPrefix)  }


  /**
   * loads page into index. It almost works, the only problem is that I have to change relative pathes in my templates
   * @param content
   * @param req
   * @return
   */
  def loadPage(content:Html)(implicit req:HttpRequest): HttpResponse = {
    val cont = if(isPjax(req))  content.body else html.index(  Some(content ) ).body
    HttpResponse(  entity = HttpEntity(MediaTypes.`text/html`, cont))
  }

  def routes = index ~  webjars ~ mystyles ~ loadResources
}

trait PJax {

  def isPjax(req:HttpRequest) = req.headers.exists(h=>h.lowercaseName()=="x-pjax")

  def loadPage(content:Html)(implicit req:HttpRequest): HttpResponse //should load page in a pjax way

}