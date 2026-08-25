package lesson_7

fun main() {
    println("Введите кол-во секунд которое нужно засечь:")
    val userNumber = readln().toInt()

    for (i in userNumber downTo 1) {
        Thread.sleep(1000)
        println(i)
    }
    println("Время вышло")
}