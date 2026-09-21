package lesson_13

class TelephoneDirectoryTerminal(
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
    val listOfСontacts: MutableList<TelephoneDirectoryTerminal> = mutableListOf()
    while (true) {
        println("Введите имя")
        val currentName = readln()
        if (currentName == "exit") {
            break
        }

        println("Введите телефон")
        val currentPhoneNumber = readln().toLongOrNull()
        if (currentPhoneNumber == null) {
            println("Вы не ввели телефон!")
            continue
        }

        println("Введите компанию")
        val currentCompanyName = readln().ifEmpty { null }

        listOfСontacts.add(TelephoneDirectoryTerminal(currentName, currentPhoneNumber, currentCompanyName))

        println("Если вы закончили введите exit")
    }
    listOfСontacts.forEach { it.printPhoneInfo() }


}