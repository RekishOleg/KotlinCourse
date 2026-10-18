package lesson_16

class Dice() {
    private val randomNumber = (1..6).random()
    fun getNumber() {
        println("Число на кубике: $randomNumber")
    }

}

fun main() {
    val dice = Dice()
    dice.getNumber()
}