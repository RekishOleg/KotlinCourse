package lesson_12

class WeatherWithLogic(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isPrecipitation: Boolean
) {

    fun printValues() {
        println(
            "Day temperature: $dayTemperature," +
                    " night temperature: $nightTemperature," +
                    " isPrecipitation: $isPrecipitation"
        )
    }
}

fun main() {
    val weather = WeatherWithLogic(10, 5, false)
    weather.printValues()

}