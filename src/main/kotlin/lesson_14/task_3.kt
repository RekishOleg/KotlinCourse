package lesson_14

const val PI_NUMBER = 3.14f
const val BLACK_COLOR = "Черный"
const val WHITE_COLOR = "Белый"

abstract class Figure(
    val color: String,
) {
    abstract fun area(): Float

    abstract fun perimeter(): Float
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun area(): Float {
        val area = PI_NUMBER * radius * radius
        return area
    }

    override fun perimeter(): Float {
        val perimeter = 2 * PI_NUMBER * radius
        return perimeter
    }
}

class Rectangle(
    color: String,
    val width: Float,
    val height: Float,
) : Figure(color) {
    override fun area(): Float {
        val area = width * height
        return area
    }

    override fun perimeter(): Float {
        val perimeter = 2 * width + 2 * height
        return perimeter
    }
}

fun main() {
    val listOfFigure = listOf<Figure>(
        Circle(BLACK_COLOR, 1),
        Circle(WHITE_COLOR, 2),
        Rectangle(BLACK_COLOR, 2.0f, 5.0f),
        Rectangle(WHITE_COLOR, 10.0f, 2.0f)
    )
    var sumOfPerimeterBlackFigure = 0.0f
    var sumOfAreaWhiteFigure = 0.0f

    for (i in listOfFigure) {
        if (i.color == WHITE_COLOR) {
            sumOfAreaWhiteFigure = sumOfAreaWhiteFigure + i.area()
        }
        if (i.color == BLACK_COLOR) {
            sumOfPerimeterBlackFigure = sumOfPerimeterBlackFigure + i.perimeter()
        }
    }
    println(
        """
        Сумма периметров всех черных фигур: $sumOfPerimeterBlackFigure
        Сумма площадей всех белых фигур: $sumOfAreaWhiteFigure
    """.trimIndent()
    )
}