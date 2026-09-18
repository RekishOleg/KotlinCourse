package lesson_13

class TelephoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
)

fun main() {
    val telephoneDirectory = TelephoneDirectory("Oleg", 123, null)
    println(telephoneDirectory.companyName)
}