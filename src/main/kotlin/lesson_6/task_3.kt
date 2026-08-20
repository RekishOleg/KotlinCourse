package lesson_6

fun main() {
    println("Введите кол-во секунд для отсчета:")
    var numberOfSeconds = readln().toInt()

    do {
        println("Осталось секунд: ${numberOfSeconds}")
        Thread.sleep(1000)
        numberOfSeconds--


    } while (numberOfSeconds > 0)

    println("Время вышло")
}