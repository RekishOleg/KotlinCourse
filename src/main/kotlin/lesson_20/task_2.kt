package lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun main() {
    val healingPotion: (Player) -> Unit = { it.currentHealth = it.currentHealth + 10 }
    val player1 = Player("Олег", 10, 100)
    println(player1.currentHealth)
    healingPotion(player1)
    println(player1.currentHealth)
}
