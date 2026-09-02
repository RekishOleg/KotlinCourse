package lesson_10

fun validateLogin(login: String, password: String) {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()

    validateLogin(login = userLogin, password = userPassword)

}