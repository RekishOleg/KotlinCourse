package lesson_4

fun main() {
    val dayOfTraining = 2
    println(
        """
        Упражнения для рук: ${dayOfTraining % 2 != 0}

        Упражнения для ног: ${dayOfTraining % 2 == 0}

        Упражнения для спины: ${dayOfTraining % 2 == 0}

        Упражнения для пресса: ${dayOfTraining % 2 != 0}
    """.trimIndent()
    )
}