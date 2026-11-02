package lesson_19

enum class Category(val displayName: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHERS("Разное");

    fun nameOfCategory(): String {
        return displayName
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printInformation() {
        println(
            """
            Имя: ${name}
            ID: ${id}
            Категория: ${category.nameOfCategory()}
        """.trimIndent()
        )
    }
}

fun main() {
    val product1 = Product("Карандаш", 1, Category.STATIONERY)
    val product2 = Product("Носки", 2, Category.CLOTHES)
    val product3 = Product("Вода", 3, Category.OTHERS)

    product1.printInformation()
    product2.printInformation()
    product3.printInformation()

}