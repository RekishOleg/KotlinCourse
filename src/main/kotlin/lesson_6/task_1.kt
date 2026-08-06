package lesson_6

fun main() {
    println("Создайте логин и пароль:")
    val loginOfUser = readln()
    val passwordOfUser = readln()
    println("Введите логин и пароль чтобы войти в приложение:")
    var enteredLogin = readln()
    var enteredPassword = readln()
    while (loginOfUser != enteredLogin || passwordOfUser != enteredPassword) {
        println("Логин или пароль введён не верно")
        println("Введите логин и пароль чтобы войти в приложение:")
        enteredLogin = readln()
        enteredPassword = readln()
    }
    println("Авторизация прошла успешно")
}