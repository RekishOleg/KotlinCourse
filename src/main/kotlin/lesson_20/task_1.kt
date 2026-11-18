package lesson_20

fun main() {
    val userName = "User"
    val greeting: () -> String = {"С наступающим Новым Годом, $userName"}
    println(greeting())
}