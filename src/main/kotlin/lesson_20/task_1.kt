package lesson_20

fun main() {
    val userName = "пользователь"
    val greeting: () -> String = { "С наступающим Новым Годом, $userName!" }
    println(greeting())
}