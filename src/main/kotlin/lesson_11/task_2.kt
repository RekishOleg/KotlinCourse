package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun printInformationOfUser() {
        println("$id, $login, $password, $mail, $bio")
    }

    fun changeBio() {
        println("Введите bio")
        bio = readln()

    }

    fun changePassword() {
        println("Введите текущий пароль")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль изменен")
        }
    }
}

fun main() {
    val user1 = User2(id = 1, login = "Oleg", password = "password", mail = "my_email.com", bio = "Kotlin")
    user1.changePassword()
    user1.printInformationOfUser()
}

