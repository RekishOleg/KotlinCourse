package lesson_14

open class Liner(
    open val speed: Int = 20,
    open val carrying: Int = 40,
    open val seats: Int = 500
)

class Cargo(
    override val speed: Int = 15,
    override val carrying: Int = 100,
    override val seats: Int = 100
) : Liner()

class Icebreaker(
    override val speed: Int = 15,
    override val carrying: Int = 20,
    override val seats: Int = 100,
    val doesIcebreaker: Boolean = true
) : Liner()

fun main() {
    val ship1 = Liner()
    val ship2 = Cargo()
    val ship3 = Icebreaker()
}