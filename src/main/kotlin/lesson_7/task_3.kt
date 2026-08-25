package lesson_7

fun main() {
    println("Введите число")
    val userNumber = readln().toInt()
    for (i in 0 until userNumber step 2) {
        println(i)
    }
}