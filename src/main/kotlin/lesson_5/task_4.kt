package lesson_5
const val NAME_OF_USER_1 = "Zaphod"
const val PASSWORD_OF_USER_1 = "PanGalactic"
fun main(){

    println("Введите имя пользователя:")
    val nameOfCurrentUser = readln()

    when(nameOfCurrentUser){
        NAME_OF_USER_1 -> println("Пользователь найден, введите пароль")
        else -> println("Пользователь не найден, пройдите верификацию")
    }
    val passwordOfCurrentUser = readln()
    when(passwordOfCurrentUser){
        PASSWORD_OF_USER_1 -> println("Добро пожаловать, $nameOfCurrentUser")
        else -> println("Пароль неверный, попробуйте еще раз")
    }
}