package lesson_14

open class CelestialBody(
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    val name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val listOfSatellite: List<Satellite>,

    ) : CelestialBody(hasAtmosphere, isLandable)

class Satellite(
    val name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(hasAtmosphere, isLandable)

fun main() {
    val satellite1 = Satellite(
        "Moon",
        true,
        false
    )

    val satellite2 = Satellite(
        "Kek",
        true,
        false
    )

    val planet = Planet(
        "Saturn",
        true,
        true,
        listOf(satellite1, satellite2)
    )

    println(planet.name)
    planet.listOfSatellite.forEach { println(it.name) }
}