package lesson_10

const val USER_LOGIN = "Admin"
const val USER_PASSWORD = "Qwerty123"
const val POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
val listOfProducts = listOf("Греча", "Сыр", "Колбаса")

fun authenticateUser(login: String, password: String): String? =
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        (List(32) { POOL.random() }).joinToString("")

    } else {
        null
    }

fun main() {
    val currentLogin = "Admin"
    val currentPassword = "Qwerty123"
    val currentToken = authenticateUser(login = currentLogin, password = currentPassword)

    if (currentToken != null) {
        println(getTheShoppingCart(token = currentToken).joinToString(", "))
    } else {
        println("Неудачная авторизация")
    }
}

fun getTheShoppingCart(token: String): List<String> = listOfProducts

