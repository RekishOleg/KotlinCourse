package lesson_8

fun main() {
    println("Сколько ингридиентов вы хотите добавить?")
    val userNumberOfIngredients = readln().toInt()
    val arrayOfIngredients = Array(userNumberOfIngredients) { "" }

    for (i in 0..userNumberOfIngredients - 1) {
        println("Введите Ингридиент №${i + 1}")
        arrayOfIngredients[i] = readln()
    }

    println(arrayOfIngredients.joinToString(", "))

}