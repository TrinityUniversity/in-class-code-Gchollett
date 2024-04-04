package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.StudentData
import models.Counting

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def form = Action {
    Ok(views.html.form())
  }

  def count = Action { implicit request =>
    Ok(views.html.count())
  }
  def increment = Action{
    print(Counting.increment())
    Ok(<p>Counting.increment()</p>)
  }
  def scooby = Action {request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map {args => 
      val name = args("name").head
      val color = args("color").head
      if(StudentData.validateStudent(name)){
        Ok(views.html.spank(name,color))
      }else{
        Redirect(routes.Application.form)
      }
    }.getOrElse(Redirect(routes.Application.form))
  }

  def spank(name: String,color: String) = Action {
    Ok(views.html.spank(name,color))
  }
}
