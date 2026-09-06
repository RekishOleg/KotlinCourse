package lesson_11

class RecipeCategory(
    val name: String,
    val description: String,
    val imageUrl: String,
)

class Recipe(
    val name: String,
    val numberOfServings: Int,
    val preparationMethods: List<String>,
    val ingredients: List<Ingredient>,
    val category: RecipeCategory,
    val imageUrl: String,
)

class Ingredient(
    val name: String,
    val amount: String,
)