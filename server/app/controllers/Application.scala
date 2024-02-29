package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def form = Action {
    Ok(views.html.form())
  }

  def scooby = Action {request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map {args => 
      val name = args("name").head
      val color = args("color").head
      Redirect(routes.Application.spank(name,color))
    }.getOrElse(Redirect(routes.Application.form))
  }

  def spank(name: String,color: String) = Action {
    Ok(views.html.spank(name,color))
  }
}
