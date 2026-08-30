package lesson_9

fun main() {
    println("Введите 5 ингредиентов")
    val userAnswer = readln()
    val listOfIngredients = userAnswer.split(", ")
    val sortedListOfIngredients = listOfIngredients.sorted()
    println(sortedListOfIngredients.joinToString(", "))
}