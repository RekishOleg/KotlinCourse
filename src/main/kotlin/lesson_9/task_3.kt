package lesson_9

fun main() {
    val listOfIngredients = mutableListOf(2, 50, 15)
    println("Сколько нужно порций?")
    val userAnswer = readln().toInt()
    val userListOfIngredients = listOfIngredients.map { it * userAnswer }
    println(
        "На $userAnswer порций вам понадобится: Яиц – ${userListOfIngredients[0]}," +
                " молока – ${userListOfIngredients[1]}, сливочного масла – ${userListOfIngredients[2]}"
    )
}