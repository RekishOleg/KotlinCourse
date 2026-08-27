package lesson_8

fun main() {
    val arrayOfIngredient = arrayOf("Яйца", "Бекон", "Зелень", "Лук")
    println(arrayOfIngredient.joinToString(", "))
    var userIngredientToDelete = ""

    while (!arrayOfIngredient.contains(userIngredientToDelete)) {
        println("Какой ингредиент заменить?")
        userIngredientToDelete = readln()
        if (!arrayOfIngredient.contains(userIngredientToDelete)) {
            println("Такого ингредиента нет!")

        }
    }

    println("Какой ингредиент добавить?")
    val userIngredientToAdd = readln()

    arrayOfIngredient[arrayOfIngredient.indexOf(userIngredientToDelete)] = userIngredientToAdd

    println("Готово! Вы сохранили следующий список: ${arrayOfIngredient.joinToString(", ")}")
}