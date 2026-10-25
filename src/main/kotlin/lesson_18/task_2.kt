package lesson_18

abstract class Dice {
    abstract val sides: Int
    fun rollDice() {
        val randomNumber = (1..sides).random()
        println("Значение на кости: $randomNumber")
    }
}

class FourSidedDice() : Dice() {
    override val sides: Int = 4
}

class SixSidedDice() : Dice() {
    override val sides: Int = 6
}

class EightSidedDice() : Dice() {
    override val sides: Int = 8
}

fun main() {
    val fourSidedDice = FourSidedDice()
    val sixSidedDice = SixSidedDice()
    val eightSidedDice = EightSidedDice()

    val listOfDices = listOf<Dice>(fourSidedDice, sixSidedDice, eightSidedDice)
    listOfDices.forEach { it.rollDice() }
}