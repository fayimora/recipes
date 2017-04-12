package controllers

import javax.inject.Inject

import forms.CreateIngredientForm
import models.Ingredient
import play.api.libs.concurrent.Execution.Implicits._
import play.api.mvc.{Action, Controller}
import services.IngredientService

import scala.concurrent.Future

/**
  * Created by fayimora on 12/04/2017.
  */
class IngredientsController @Inject()(ingredientService: IngredientService) extends Controller {

  def showCreateForm = Action { implicit request =>
    Ok(views.html.createIngredient(CreateIngredientForm.form))
  }

  def submit = Action.async { implicit request =>
    CreateIngredientForm.form.bindFromRequest.fold(
      formWithErrors => Future.successful(BadRequest(views.html.createIngredient(formWithErrors))),
      formData => {
        val newIngredient = Ingredient(
          id = java.util.UUID.randomUUID().toString,
          name = formData.name,
          description = formData.description,
          quantifier = formData.quantifier
        )
        ingredientService.save(newIngredient)
        Future.successful(Redirect(routes.IngredientsController.showCreateForm()).flashing("info" -> "Ingredient created!"))
      }
    )
  }

  def list = Action.async { implicit request =>
    ingredientService.all().map(ingredients => Ok(views.html.listIngredients(ingredients)))
  }
}
