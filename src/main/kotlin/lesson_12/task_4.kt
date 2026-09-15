package lesson_12


class WeatherWithOutput(
    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean
) {
    val dayTemperatureCelsius: Int = dayTemperature - 273
    val nightTemperatureCelsius: Int = nightTemperature - 273
    val isPrecipitation: Boolean = isPrecipitation

    init {
        println(
            "Day temperature: $dayTemperatureCelsius," +
                    " night temperature: $nightTemperatureCelsius," +
                    " isPrecipitation: $isPrecipitation"
        )
    }
}

fun main() {
    val weather = WeatherWithOutput(10, 5, false)


}