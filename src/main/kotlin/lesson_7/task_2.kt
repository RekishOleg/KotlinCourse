package lesson_7

fun main() {
    var smsCode = ""
    var userCode = ""
    do {
        smsCode = (1000..9999).random().toString()
        println("Ваш код авторизации: $smsCode")
        userCode = readln()
        if (userCode == smsCode) {
            println("Добро пожаловать!")
        }
    } while (userCode != smsCode)

}