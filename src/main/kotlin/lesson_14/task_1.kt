package lesson_14

open class Liner(
    open val speed: Int = 20,
    open val cargoCapacity: Int = 40,
    open val passengerCapacity: Int = 500
)

class Cargo(
    override val speed: Int = 15,
    override val cargoCapacity: Int = 100,
    override val passengerCapacity: Int = 100
) : Liner()

class Icebreaker(
    override val speed: Int = 15,
    override val cargoCapacity: Int = 20,
    override val passengerCapacity: Int = 100,
    val doesIcebreaker: Boolean = true
) : Liner()

fun main() {
    val ship1 = Liner()
    val ship2 = Cargo()
    val ship3 = Icebreaker()
}