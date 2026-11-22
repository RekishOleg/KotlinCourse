package lesson_20

class Robot {
    var modifier: ((String) -> String)? = null
    val phrases = listOf("Hello", "How are you?", "Bie", "Hi", "You are pretty")

    fun say() {
        val current = modifier
        val randomPhrases = phrases.random()

        if (current != null) {
            println(current(randomPhrases))
        } else println(randomPhrases)
    }

    fun speechModifier(lambda: (String) -> String) {
        modifier = lambda
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.speechModifier { phrase -> phrase.reversed() }
    robot.say()
}