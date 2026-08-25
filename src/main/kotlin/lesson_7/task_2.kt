package lesson_7

fun main() {
    do {
        val smsCode = (1000..9999).random().toString()
        println("Ваш код для авторизации: $smsCode")
        val userCode = readln()
        if (userCode == smsCode) {
            println("Добро пожаловать!")
        }
    } while (userCode != smsCode)

}