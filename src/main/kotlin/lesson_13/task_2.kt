package lesson_13

class TelephoneDirectorySafeCall(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun printPhoneInfo() {
        println("Имя: $name\n" +
                "Номер: $phoneNumber\n" +
                "Компания: ${companyName ?: "<не указано>"}"
        )
    }
}

fun main() {
    val telephoneDirectory = TelephoneDirectorySafeCall("Oleg", 123, null)
    telephoneDirectory.printPhoneInfo()
}