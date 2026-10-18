package lesson_16

class Order(
    private val number: Int,
    initialStatus: String
) {
    var status: String = initialStatus
        private set

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendToManager(newStatus: String) {
        changeStatus(newStatus)
    }
}

fun main() {
    val order = Order(1, "В процессе...")
    order.sendToManager("Готово")
    println(order.status)
}