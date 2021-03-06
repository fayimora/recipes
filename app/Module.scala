import com.google.inject.AbstractModule
import models.daos.{DefaultIngredientDAO, DefaultRecipeDAO, IngredientDAO, RecipeDAO}
import net.codingwell.scalaguice.ScalaModule
import services.{DefaultIngredientService, DefaultRecipeService, IngredientService, RecipeService}


/**
 * This class is a Guice module that tells Guice how to bind several
 * different types. This Guice module is created when the Play
 * application starts.

 * Play will automatically use any class called `Module` that is in
 * the root package. You can create modules in other locations by
 * adding `play.modules.enabled` settings to the `application.conf`
 * configuration file.
 */
class Module extends AbstractModule with ScalaModule {

  override def configure() = {
    bind[RecipeDAO].to[DefaultRecipeDAO]
    bind[IngredientDAO].to[DefaultIngredientDAO]
    bind[RecipeService].to[DefaultRecipeService]
    bind[IngredientService].to[DefaultIngredientService]
  }

}
