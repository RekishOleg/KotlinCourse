package lesson_11

class User (
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {
    val user1 = User(1, "John", "123", "secret@gmail.com")
    val user2 = User(2, "Oleg", "456", "banana@gmail.com")
    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.mail}")
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.mail}")

}