package lesson_6

fun main() {
    var numberOfAttempts = 3
    val range = (1..9).toList()

    while (numberOfAttempts > 0) {
        numberOfAttempts--
        val shuffledRange = range.shuffled()
        val number1 = shuffledRange[0]
        val number2 = shuffledRange[1]
        val correctAnswer = number1 + number2
        println("Решите пример чтобы доказать что вы не бот: $number1 + $number2")
        val userAnswer = readln().toInt()
        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверно. Осталось попыток: $numberOfAttempts")
        }
        if (numberOfAttempts == 0) {
            println("Доступ запрещен")
        }
    }
}