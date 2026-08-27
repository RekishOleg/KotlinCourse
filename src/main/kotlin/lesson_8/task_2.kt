package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Спагетти", "Бекон", "Пармезан", "Яйцо")
    println("Какой ингредиент вам нужен?")
    val userIngredient = readln()
    var isFound = false

    for (ingredient in arrayOfIngredients) {

        if (ingredient == userIngredient) {
            println("Ингредиент [${userIngredient}] в рецепте есть")
            isFound = true
            break
        }
    }
    if (!isFound) {
        println("Такого ингредиента в рецепте нет")
    }
}