package lesson_3

fun main() {
    val sentLine = "D2-D4;0"
    val partsOfLine = sentLine.split("-", ";")
    val from = partsOfLine[0]
    val to = partsOfLine[1]
    val numberOfMove = partsOfLine[2]
    println(
        """
        $from
        $to
        $numberOfMove
    """.trimIndent()
    )

}