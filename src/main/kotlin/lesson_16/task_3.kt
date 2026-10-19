package lesson_16

class User(
    val login: String,
    private val password: String,
) {
    fun checkPassword(currentPassword: String): Boolean {
        return currentPassword == password
    }
}

fun main() {
    val user = User("Олег", "123abc")
    val isPasswordCorrect = user.checkPassword("123abc")
    if (isPasswordCorrect) {
        println("Пароль верный")
    } else println("Пароль неверный")

}