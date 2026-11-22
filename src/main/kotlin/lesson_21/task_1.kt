package lesson_21

fun String.vowelCount(): Int {
    val vowels = "AEIOUaeiou"
    return count { it in vowels }
}

fun main() {
    val greeting = "Hello world"
    println(greeting.vowelCount())
}