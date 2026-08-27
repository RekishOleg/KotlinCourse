package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Спагетти", "Бекон", "Пармезан", "Яйцо")

    println("Какой ингредиент вам нужен?")
    val userIngredient = readln()

    if (arrayOfIngredients.contains(userIngredient)) {
        println("Ингредиент ${userIngredient} в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}