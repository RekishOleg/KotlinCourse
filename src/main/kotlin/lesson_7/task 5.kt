package lesson_7

fun main() {
    val numbers = '1'..'9'
    val alphabetLowerCase = 'a'..'z'
    val alphabetUpperCase = 'A'..'Z'
    val pool = numbers + alphabetLowerCase + alphabetUpperCase
    var lengthPassword = 0
    var password = mutableListOf<Char>()

    while (lengthPassword < 6) {
        println("Задайте длину пароля больше чем 6 символов:")
        lengthPassword = readln().toInt()
        if (lengthPassword < 6) {
            println("Длина пароля меньше чем 6 символов!")
        }
    }

    password.add(alphabetUpperCase.random())
    password.add(alphabetLowerCase.random())
    password.add(numbers.random())

    for (i in 1..lengthPassword - 3) {
        password += pool.random()
    }
    password.shuffle()
    val finalPassword = password.joinToString("")
    println(finalPassword)

}