package models.daos
import models.Recipe

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by fayimora on 12/04/2017.
  */
class DefaultRecipeDAO extends RecipeDAO {
  def findById(id: String)(implicit ec: ExecutionContext): Future[Option[Recipe]] = ???

  def save(recipe: Recipe)(implicit ec: ExecutionContext): Future[Recipe] = ???

  def removeById(id: String)(implicit ec: ExecutionContext): Future[Unit] = ???
}
