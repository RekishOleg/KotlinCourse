package lesson_16

class Circle(
    private val radius: Int,
) {
    private val pi = 3.14

    fun circumference() {
        println("Длина окружности: ${2 * pi * radius} ")
    }

    fun areaOfCircle() {
        println("Площадь круга: ${(pi * (radius * radius))}")
    }
}

fun main() {
    val circle = Circle(3)
    circle.circumference()
    circle.areaOfCircle()
}