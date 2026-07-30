package lesson_4

const val ALL_TABLES = 13

fun main() {
    val bokingToday = 13
    val bokingTomorrow = 9
    println("Доступность столиков на сегодня: ${bokingToday < ALL_TABLES},\nДоступность столиков на завтра: ${bokingTomorrow < ALL_TABLES}")

}