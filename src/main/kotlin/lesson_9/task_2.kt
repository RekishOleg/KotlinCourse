package lesson_9

fun main() {
    val listOfIngredients = mutableListOf("Яйцо", "Помидор", "Бекон")
    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString(", ")}")
    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer.equals("ДА", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")

    } else {
        return
    }

    val userIngredient = readln()
    listOfIngredients.add(userIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}")

}