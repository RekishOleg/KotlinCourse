package lesson_17

class Ship(
    initialName: String,
    val averageSpeed: Int,
    val homePort: String,
){
    var name = initialName
        set(field){
            println("Имя корабля менять нельзя!")
        }
}

fun main() {
    val ship = Ship("Летучий голландец", 10, "Где-то там")
    println(ship.name)
    ship.name = "Парабола"
    println(ship.name)
}