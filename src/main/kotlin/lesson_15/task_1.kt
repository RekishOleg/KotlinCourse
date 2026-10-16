package lesson_15

interface Flight {
    fun fly(): String
}

interface Swimming {
    fun swim(): String
}

class CrucianCarp : Swimming {
    override fun swim(): String {
        return "Плавать в воде"
    }

}

class Seagull : Flight {
    override fun fly(): String {
        return "Летать"
    }

}

class Duck : Flight, Swimming {
    override fun fly(): String {
        return "Летать"
    }

    override fun swim(): String {
        return "Плыть по воде"
    }

}

fun main() {
    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    println(crucianCarp.swim())
    println(seagull.fly())
    println(duck.fly())
    println(duck.swim())

}