package services
import javax.inject.Inject

import models.Recipe
import models.daos.DefaultRecipeDAO

import scala.concurrent.Future

/**
  * Created by fayimora on 12/04/2017.
  */
class DefaultRecipeService @Inject()(dao: DefaultRecipeDAO) extends RecipeService {
  def findById(id: String): Future[Recipe] = ???

  def save(recipe: Recipe): Future[Recipe] = ???
}
