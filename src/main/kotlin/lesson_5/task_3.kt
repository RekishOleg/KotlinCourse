package lesson_5

const val CORRECT_NUM_ONE = 6
const val CORRECT_NUM_TWO = 7

fun main() {
    print("Enter your numbers: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    print("Correct numbers: 6, 7")
    if (num1 == CORRECT_NUM_ONE && num2 == CORRECT_NUM_TWO || num1 == CORRECT_NUM_TWO && num2 == CORRECT_NUM_ONE) {
        println("Congratulations! You won the main prize!")
    } else if (num1 == CORRECT_NUM_ONE || num2 == CORRECT_NUM_TWO || num1 == CORRECT_NUM_TWO || num2 == CORRECT_NUM_ONE) {
        println("You won a consolation prize")
    } else {
        println("Failure!")
    }
}