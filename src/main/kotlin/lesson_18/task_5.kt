package lesson_18

class Screen(
) {
    fun draw(x: Int, y: Int, figure: String): String {
        return "Нарисована фигура - $figure в координатах: ($x ; $y)"
    }

    fun draw(x: Float, y: Int, figure: String): String {
        return "Нарисована фигура - $figure в координатах: ($x ; $y)"
    }

    fun draw(x: Int, y: Float, figure: String): String {
        return "Нарисована фигура - $figure в координатах: ($x ; $y)"
    }

    fun draw(x: Float, y: Float, figure: String): String {
        return "Нарисована фигура - $figure в координатах: ($x ; $y)"
    }
}

fun main() {
    val screen1 = Screen()
    println(screen1.draw(2, 2, "Круг"))
    println(screen1.draw(2.1f, 3, "Квадрат"))
    println(screen1.draw(4, 3.2f, "Точка"))
    println(screen1.draw(4.6f, 1.4f, "Точка"))
}