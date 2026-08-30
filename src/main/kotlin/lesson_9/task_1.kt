package lesson_9

fun main() {
    val listOfIngredients = listOf("Огурец", "Помидор", "Перец", "Масло")

    println("В рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}")
    listOfIngredients.forEach {
        println(it)
    }
}