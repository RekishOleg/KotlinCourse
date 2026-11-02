package lesson_19

enum class Gender(val gender: String) {
    MALE("Мужчина"),
    FEMALE("Женщина")
}

class Person private constructor(
    val name: String,
    val gender: Gender,
) {
    companion object {
        fun create(name: String, gender: Gender): Person {
            require(name.isNotBlank()) { "Имя обязательно" }
            return Person(name, gender)
        }
    }
}

class CardIndex {
    private val persons: MutableList<Person> = mutableListOf<Person>()
    fun add(person: Person) {
        persons.add(person)
    }

    fun all(): List<Person> = persons
}

fun parseGender(input: String): Gender? = when (input.lowercase().trim()) {
    "male", "мужчина", "м" -> Gender.MALE
    "female", "женщина", "ж" -> Gender.FEMALE
    else -> null
}

fun main() {
    val cardIndex = CardIndex()
    println("Введите Имя и гендер: ${Gender.MALE.gender} или ${Gender.FEMALE.gender}")

    while (cardIndex.all().size < 5) {
        val userText = readln()
        val parts = userText.trim().split(" ")
        if (parts.size < 2) {
            println("Нужно два слова: имя и пол")
            continue   // перейти к следующей итерации
        }
        val name = parts[0]
        val gender = parseGender(parts[1]) ?: run {
            println("Неверный пол")
            continue
        }
        cardIndex.add(Person.create(name, gender))

    }
    cardIndex.all().forEach { person ->
        println("${person.name} — ${person.gender.gender}")
    }

}