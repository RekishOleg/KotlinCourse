package lesson_15

interface Searchable {
    fun search()
}

abstract class Product(
    val name: String,
    val quantity: Int,
)

class Tool(
    name: String,
    quantity: Int,
) : Product(name, quantity), Searchable {

    override fun search() {
        println("Выполняется поиск")
    }
}

class Component(
    name: String,
    quantity: Int
) : Product(name, quantity)

fun main() {
    val tool = Tool("Гитара", 3)
    tool.search()
}