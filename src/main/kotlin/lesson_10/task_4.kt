package lesson_10

fun randomNumber(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

fun diceRoll(): Boolean {
    val computerRoll = randomNumber()
    val userRoll = randomNumber()
    var isUserWins = false
    if (userRoll > computerRoll) {
        println("Победило человечество")
        isUserWins = true
    } else if (userRoll < computerRoll) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
    return isUserWins
}

fun main() {
    var winsOfUser = 0
    var userAnswer = ""
    do {
        if (diceRoll()){
            winsOfUser += 1
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
         userAnswer = readln()

    }while (userAnswer == "Да")
    println(winsOfUser)
}