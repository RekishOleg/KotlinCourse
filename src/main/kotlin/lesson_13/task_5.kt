package lesson_13

class TelephoneDirectoryErrorHandling(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun printPhoneInfo() {
        println(
            "Имя: $name\n" +
                    "Номер: $phoneNumber\n" +
                    "Компания: ${companyName ?: "<не указано>"}"
        )
    }
}

fun main() {
    println("Введите имя")
    val currentName = readln()


    println("Введите телефон")
    val input = readln()
    val currentPhoneNumber: Long? = try {
        input.toLong()
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
        null
    }
    if (currentPhoneNumber == null) {
        return
    }

    println("Введите компанию")
    val currentCompanyName = readln()

    val telephoneDirectory = TelephoneDirectoryErrorHandling(currentName, currentPhoneNumber, currentCompanyName)
    telephoneDirectory.printPhoneInfo()
}