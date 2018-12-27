package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController2 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(model.MyModel("app2").toString)
  }

}
