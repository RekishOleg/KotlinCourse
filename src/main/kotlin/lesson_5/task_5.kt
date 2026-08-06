package lesson_5

fun main() {
    val range = (0..42).toList()
    val correctNumbers = range.shuffled().take(3)

    println("Введите три числа:")
    val userNumber1 = readln().toInt()
    val userNumber2 = readln().toInt()
    val userNumber3 = readln().toInt()
    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)

    val correctlyGuessedNumbers = correctNumbers.intersect(userNumbers)
    val numberOfCorrectGuesses = correctlyGuessedNumbers.size

    when (numberOfCorrectGuesses) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа")

    }
    println("Выигрышные числа: ${correctNumbers.joinToString(" ")}")


}