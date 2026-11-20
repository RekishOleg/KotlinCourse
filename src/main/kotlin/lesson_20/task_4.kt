package lesson_20

fun main() {
    val elements = listOf<String>("1", "2", "3", "4", "5")
    val actions = elements.map { element -> { println("Нажат элемент $element") } }
    for (i in 1 until actions.size step 2) {
        actions[i]()
    }
}