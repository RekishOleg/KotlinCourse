package lesson_8

fun main(){
    val arrayOfIngredient = arrayOf("Яйца", "Бекон", "Зелень", "Лук")
    println(arrayOfIngredient.joinToString(", "))

    println("Какой ингредиент заменить?")
    val userIngredientToDelete = readln()
    if (!arrayOfIngredient.contains(userIngredientToDelete)){
        println("Такого ингредиента нет!")
        return
    }

    println("Какой ингредиент добавить?")
    val userIngredientToAdd = readln()

    arrayOfIngredient[arrayOfIngredient.indexOf(userIngredientToDelete)] = userIngredientToAdd

    println("Готово! Вы сохранили следующий список: ${arrayOfIngredient.joinToString(", ")}")
}