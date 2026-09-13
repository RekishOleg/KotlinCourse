package lesson_12

class Weather(
) {
    var dayTemperature = 15
    var nightTemperature = 7
    var isPrecipitation = false

    fun printValues() {
        println(
            "Day temperature: $dayTemperature," +
                    " night temperature: $nightTemperature," +
                    " isPrecipitation: $isPrecipitation "
        )
    }
}

fun main() {
    val weather1 = Weather()
    weather1.dayTemperature = 5
    weather1.nightTemperature = 0
    weather1.isPrecipitation = true
    val weather2 = Weather()
    weather2.dayTemperature = 40
    weather2.nightTemperature = 25
    weather2.isPrecipitation = true



    weather1.printValues()
    weather2.printValues()
}