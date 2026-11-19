package lesson_20

class Player1(
    val hasKey: Boolean,
    val name: String,
)

val keyVerification: (Player1) -> String = { if (it.hasKey) "Игрок открыл дверь" else "Дверь заперта" }

fun main() {
    val player1 = Player1(true, "Oleg")
    println(player1.hasKey)
    println(keyVerification(player1))
}