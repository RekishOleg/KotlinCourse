package lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy(): Boolean = currentHealth == maxHealth


fun main() {
    val player1 = Player("User123", 30, 100)
    val player2 = Player("User456", 100, 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}