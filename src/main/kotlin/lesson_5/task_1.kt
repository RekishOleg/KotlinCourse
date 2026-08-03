package lesson_5

fun main() {
    println("Докажите что вы не бот\nСложите два числа: 2 + 2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == 4) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}