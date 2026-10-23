package lesson_18

class Order(
    val number: Int,
) {
    fun information(product: String) {
        println("Заказан товар: $product")
    }

    fun information(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.information("Молоток")
    order2.information(listOf("Пасатижи", "Пила"))

}