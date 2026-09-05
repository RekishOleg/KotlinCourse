package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printInformationOfUser() {
        println("$id, $login, $password, $email, $bio")
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
    val user1 = User2(id = 1, login = "Oleg", password = "password", email = "my_email.com")
    user1.changeBio()
    user1.changePassword()
    user1.printInformationOfUser()
}

