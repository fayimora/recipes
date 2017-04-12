package models.daos

import models.Ingredient

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by fayimora on 12/04/2017.
  */
trait IngredientDAO {
  def findById(id: String)(implicit ec: ExecutionContext): Future[Option[Ingredient]]
  def save(ing: Ingredient)(implicit ec: ExecutionContext): Future[Ingredient]
  def removeById(id: String)(implicit ec: ExecutionContext): Future[Unit]
}
