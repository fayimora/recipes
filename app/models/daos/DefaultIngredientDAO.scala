package models.daos
import models.Ingredient

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by fayimora on 12/04/2017.
  */
class DefaultIngredientDAO extends IngredientDAO {
  private var database = collection.mutable.ListBuffer[Ingredient]()

  def all()(implicit ec: ExecutionContext): Future[Seq[Ingredient]] = Future.successful(database)

  def findById(id: String)(implicit ec: ExecutionContext): Future[Option[Ingredient]] = ???

  def save(ingredient: Ingredient)(implicit ec: ExecutionContext): Future[Ingredient] = Future {
    database += ingredient
    ingredient
  }

  def removeById(id: String)(implicit ec: ExecutionContext): Future[Unit] = ???

}
