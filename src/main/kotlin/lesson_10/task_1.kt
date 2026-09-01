package lesson_10

fun diceRoll(name: String): Int {
    val randomNumber = (1..6).random()
    println("$name бросил: $randomNumber")
    return randomNumber
}

fun main() {
    val userMove = diceRoll(name = "Игрок")
    val computerMove = diceRoll(name = "Компьютер")
    if (userMove > computerMove) {
        println("Победило человечество")
    } else if (userMove < computerMove) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
}