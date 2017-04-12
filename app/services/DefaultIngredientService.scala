package services
import javax.inject.Inject

import models.Ingredient
import models.daos.IngredientDAO

import scala.concurrent.Future

/**
  * Created by fayimora on 12/04/2017.
  */
class DefaultIngredientService @Inject()(dao: IngredientDAO) extends IngredientService {
  def findById(id: String): Future[Ingredient] = ???

  def save(ingredient: Ingredient): Future[Ingredient] = ???
}
