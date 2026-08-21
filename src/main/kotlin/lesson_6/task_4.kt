package lesson_6

fun main() {
    val range = 1..9
    val randomNumber = range.random()
    var numberOfAttempts = 5

    while (true) {
        numberOfAttempts--
        println("Введите число от 1 до 9")
        val userNumber = readln().toInt()

        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно \n Осталось попыток: $numberOfAttempts ")
        }

        if (numberOfAttempts == 0) {
            println("Было загадано число $randomNumber")
            break
        }
    }
}