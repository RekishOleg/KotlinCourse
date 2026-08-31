package lesson_9

fun main() {
    val listOfIngredients = mutableListOf<String>()
    println("Введите пять названий ингредиентов")
    for (i in 1..5) {
        listOfIngredients.add(readln())
    }
    val result =
        listOfIngredients
        .distinct()
        .sorted()
        .joinToString(", ")
        .replaceFirstChar { it.uppercase() }

    println(result)
}