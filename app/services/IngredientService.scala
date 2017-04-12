package services

import models.Ingredient

import scala.concurrent.Future

/**
  * Created by fayimora on 12/04/2017.
  */
trait IngredientService {
  def all(): Future[Seq[Ingredient]]
  def findById(id: String): Future[Ingredient]
  def save(ingredient: Ingredient): Future[Ingredient]
}
