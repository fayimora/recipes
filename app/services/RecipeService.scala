package services

import models.Recipe

import scala.concurrent.Future

/**
  * Created by fayimora on 12/04/2017.
  */
trait RecipeService {
  def findById(id: String): Future[Recipe]
  def save(recipe: Recipe): Future[Recipe]
}
