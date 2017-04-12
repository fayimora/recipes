package forms

import play.api.data.Form
import play.api.data.Forms._

/**
  * Created by fayimora on 12/04/2017.
  */
object CreateIngredientForm {
  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "quantifier" -> nonEmptyText
    )(Data.apply)(Data.unapply)
  )
  case class Data(name: String, description: String, quantifier: String)
}
