package lesson_5


const val CORRECT_NUM_ONE = 6
const val CORRECT_NUM_TWO = 7
fun main() {
    print("Введите ваши числа: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    print("Правильные числа: 6, 7")
    if (num1 == CORRECT_NUM_ONE && num2 == CORRECT_NUM_TWO || num1 == CORRECT_NUM_TWO && num2 == CORRECT_NUM_ONE) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (num1 == CORRECT_NUM_ONE || num2 == CORRECT_NUM_TWO || num1 == CORRECT_NUM_TWO || num2 == CORRECT_NUM_ONE) {
        println("Вы выиграли утешительный приз")
    } else {
        println("Неудача!")
    }
}