package lesson_19

class Spacecraft {
    fun takeoff() {
        println("Космический корабль взлетает!")
        // TODO("Добавить логику набирания скорости")
    }

    fun land() {
        println("Космический корабль приземлился")
    }

    fun shoot() {
        TODO("Добавить логику стрельбы")
    }
}

fun main() {
    val spacecraft = Spacecraft()
    spacecraft.takeoff()
    spacecraft.land()
    spacecraft.shoot()
}