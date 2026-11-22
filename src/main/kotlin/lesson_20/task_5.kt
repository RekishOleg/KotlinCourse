package lesson_20

class Robot {
    private var speechModifier: ((String) -> String)? = null
    val phrases = listOf("Hello", "How are you?", "Bie", "Hi", "You are pretty")

    fun say() {
        val current = speechModifier
        val randomPhrase = phrases.random()

        if (current != null) {
            println(current(randomPhrase))
        } else println(randomPhrase)
    }

    fun setModifier(lambda: (String) -> String) {
        speechModifier = lambda
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { phrase -> phrase.reversed() }
    robot.say()
}