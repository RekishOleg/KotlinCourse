package lesson_3

fun main() {
    var previousPosition = "E2"
    var curentPosition = "E4"
    var numberOfMove = 1
    println("[$previousPosition-$curentPosition;$numberOfMove]")

    numberOfMove += 1
    previousPosition = "D2"
    curentPosition = "D3"
    println("[$previousPosition-$curentPosition;$numberOfMove]")
}