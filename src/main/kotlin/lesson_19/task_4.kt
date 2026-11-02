package lesson_19

enum class Bullet(val type: String, val damage: Int) {
    BLUE_BULLET("Синий патрон", 5),
    GREEN_BULLET("Зеленый патрон", 10),
    RED_BULLET("Красный патрон", 20),
}

class Tank {
    var bullet: Bullet? = null
    fun changeAmmo(initBullet: Bullet) {
        bullet = initBullet
        println("Танк заряжен - \"${initBullet.type}\"")
    }

    fun shot() {
        bullet?.let { println("Выстрел - \"${it.type}\", Урон - \"${it.damage}\"") } ?: println("Танк не заряжен")
    }
}

fun main(){
    val tank = Tank()
    tank.changeAmmo(Bullet.BLUE_BULLET)
    tank.shot()

    tank.changeAmmo(Bullet.GREEN_BULLET)
    tank.shot()

    tank.changeAmmo(Bullet.RED_BULLET)
    tank.shot()
}