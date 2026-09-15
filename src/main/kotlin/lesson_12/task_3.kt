package lesson_12


class WeatherWithKelvins(
    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean
) {
    val dayTemperatureCelsius: Int = dayTemperature - 273
    val nightTemperatureCelsius: Int = nightTemperature - 273
    val isPrecipitation: Boolean = isPrecipitation

    fun printValues() {
        println(
            "Day temperature: $dayTemperatureCelsius," +
                    " night temperature: $nightTemperatureCelsius," +
                    " isPrecipitation: $isPrecipitation"
        )
    }
}

fun main() {
    val weather = WeatherWithKelvins(10, 5, false)
    weather.printValues()

}