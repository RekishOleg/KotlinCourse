package lesson_10

fun generatePassword(length: Int = 8): String {
    val numbers = '0'..'9'
    val specialChars = "!\"#$%&'()*+,-./ "
    var password = ""
    for (i in 1..length / 2) {
        password += numbers.random()
        password += specialChars.random()

    }
    if (length % 2 != 0) {
        password += numbers.random()
    }
    return password
}

fun main() {
    println("Введите длину пароля")
    val password = generatePassword(length = readln().toInt())
    println(password)
}