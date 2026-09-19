package lesson_13


class TelephoneDirectoryWithList(
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
    val listOfPhoneNumbers: MutableList<TelephoneDirectoryWithList> =
        mutableListOf(
            TelephoneDirectoryWithList("Alex", 1, null),
            TelephoneDirectoryWithList("Bob", 2, null),
            TelephoneDirectoryWithList("", 3, "null"),
            TelephoneDirectoryWithList("Alice", 4, "kaka"),
            TelephoneDirectoryWithList("Magamed", 5, "LOL")
        )
    println(listOfPhoneNumbers.map { it.companyName }.filterNotNull().joinToString("\n"))

}
