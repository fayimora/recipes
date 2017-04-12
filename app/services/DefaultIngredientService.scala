package services
import javax.inject.Inject

import models.Ingredient
import models.daos.IngredientDAO
import play.api.libs.concurrent.Execution.Implicits._

import scala.concurrent.Future

/**
  * Created by fayimora on 12/04/2017.
  */
class DefaultIngredientService @Inject()(dao: IngredientDAO) extends IngredientService {

  def findById(id: String): Future[Ingredient] = ???

  def save(ingredient: Ingredient): Future[Ingredient] = dao.save(ingredient)

  def all(): Future[Seq[Ingredient]] = dao.all()
}
