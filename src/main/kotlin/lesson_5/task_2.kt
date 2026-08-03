package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2026

fun main() {
    println("Введите год рождения")
    val yearOfUserBirth = readln().toInt()
    val ageUser = CURRENT_YEAR - yearOfUserBirth
    if (ageUser >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")


}