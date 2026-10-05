package lesson_14


open class Liner1(
    open val speed: Int = 20,
    open val cargoCapacity: Int = 40,
    open val passengerCapacity: Int = 500
){
    fun printInformation(){
        println("""
            Скорость - $speed,
            Грузоподъемность - $cargoCapacity,
            Вместимость - $passengerCapacity.
        """.trimIndent())
    }

    open fun loading(){
        println("Выдвигается трап")
    }
}

class Cargo1(
    override val speed: Int = 15,
    override val cargoCapacity: Int = 100,
    override val passengerCapacity: Int = 100
) : Liner1(){
    override fun loading(){
        println("Активируется погрузочный кран")
    }
}

class Icebreaker1(
    override val speed: Int = 15,
    override val cargoCapacity: Int = 20,
    override val passengerCapacity: Int = 100,
    val doesIcebreaker: Boolean = true
) : Liner1(){
    override fun loading(){
        println("Открываются ворота со стороны кормы")
    }
}

fun main() {
    val linerShip = Liner1()
    val cargoShip = Cargo1()
    val icebreakerShip = Icebreaker1()
    linerShip.loading()
    linerShip.printInformation()

    cargoShip.loading()
    cargoShip.printInformation()

    icebreakerShip.loading()
    icebreakerShip.printInformation()

}