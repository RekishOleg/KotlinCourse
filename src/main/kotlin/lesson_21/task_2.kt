package lesson_21

fun List<Int>.evenNumbersSum(): Int = filter { it % 2 == 0 }.sum()

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.evenNumbersSum())
}