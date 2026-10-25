package lesson_18

abstract class Animal(
    val name: String,
) {
    abstract val food: String
    fun sleep() {
        println("$name -> спит")
    }

    fun eat() {
        println("$name -> ест $food")
    }
}

class Fox(
    name: String,
) : Animal(name) {
    override val food: String = "Ягоды"
}

class Dog(
    name: String,
) : Animal(name) {
    override val food: String = "Кости"

}

class Cat(
    name: String,
) : Animal(name) {
    override val food: String = "Рыба"
}

fun main() {
    val fox = Fox("Алиса")
    val dog = Dog("Рекс")
    val cat = Cat("Барсик")

    val listOfAnimals = listOf<Animal>(fox, dog, cat)
    listOfAnimals.forEach { it.eat() }
}