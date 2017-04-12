package models

/**
  * Created by fayimora on 12/04/2017.
  */
case class Recipe(id: String,
                  title: String,
                  description: String,
                  cookingTime: Long, // in minutes
                  imagePath: String, ingredients: Seq[Ingredient])
