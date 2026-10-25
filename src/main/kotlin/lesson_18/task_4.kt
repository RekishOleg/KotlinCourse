package lesson_18

abstract class Box(){
    abstract fun area(): Int
}

class CubeBox(
    val length: Int,
): Box() {
    override fun area(): Int {
        val areaOfBox = 6 * (length * length)
        return areaOfBox
    }
}

class RectangularBox(
    val length: Int,
    val width: Int,
    val  height: Int,
): Box(){
    override fun area(): Int {
        val areaOfBox = 2 * (length * width + width * height + length * height)
        return areaOfBox
    }
}

fun main() {
    val cubeBox = CubeBox(2)
    val rectangularBox = RectangularBox(2, 3, 4)
    println(cubeBox.area())
    println(rectangularBox.area())
}