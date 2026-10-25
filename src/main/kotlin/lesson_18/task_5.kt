package lesson_18

class Screen(
    val figure: String,
) {
    fun draw(x: Int, y: Int) {
        println("Нарисована фигура - $figure в координатах: ($x ; $y)")
    }

    fun draw(x: Float, y: Int) {
        println("Нарисована фигура - $figure в координатах: ($x ; $y)")
    }

    fun draw(x: Int, y: Float) {
        println("Нарисована фигура - $figure в координатах: ($x ; $y)")
    }

    fun draw(x: Float, y: Float) {
        println("Нарисована фигура - $figure в координатах: ($x ; $y)")
    }
}

fun main() {
    val screen1 = Screen("Квадрат")
    screen1.draw(2, 2)
    screen1.draw(2.1f, 3)
    screen1.draw(4, 3.2f)
    screen1.draw(4.6f, 1.4f)
}