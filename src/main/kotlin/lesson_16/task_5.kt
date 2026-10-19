package lesson_16

class Player(
    val name: String,
    initialHealth: Int,
    initialAttackPower: Int,
    private var canHealing: Boolean = true,
) {
    var attackPower = initialAttackPower
        private set

    var health = initialHealth
        private set

    fun takingDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            reset()
        }
    }

    fun healing(healthPoints: Int) {
        if (canHealing) {
            health += healthPoints
        } else println("$name - мертв и не может лечиться")
    }

    private fun reset() {
        attackPower = 0
        health = 0
        canHealing = false
    }
}

fun main() {
    val player = Player("Master3000", 100, 200)
    player.takingDamage(70)
    player.healing(30)

    player.takingDamage(50)
    player.healing(20)

    player.takingDamage(100)

    println(
        """
        Здоровье - ${player.health}
        Сила удара - ${player.attackPower}
    """.trimIndent()
    )
}