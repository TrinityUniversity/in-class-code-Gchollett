package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }
  
  def bonk = Action {
    val table = Array(
  Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12),
  Array(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24),
  Array(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36),
  Array(4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48),
  Array(5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60),
  Array(6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72),
  Array(7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84),
  Array(8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96),
  Array(9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 108),
  Array(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120),
  Array(11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132),
  Array(12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144)
)
    Ok(views.html.bonk("Bonk",table))
  }
}
