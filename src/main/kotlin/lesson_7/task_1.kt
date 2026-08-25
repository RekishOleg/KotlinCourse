package lesson_7

import kotlin.random.Random

fun main() {
    val alphabet = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    var password = ""
    for (i in 1..3) {
        password += alphabet[Random.nextInt(alphabet.size)]
        password += numbers[Random.nextInt(numbers.size)]
    }
    println(password)
}