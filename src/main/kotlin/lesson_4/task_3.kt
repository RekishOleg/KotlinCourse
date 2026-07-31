package lesson_4

const val AIR_HUMIDITY = 20
const val RIGHT_SEASON = "Зима"

fun main() {
    val sunnyWeather = true
    val openCanopy = true
    val sunnyWeatherToday = true
    val openCanopyToday = true
    val airHumidityToday = 20
    val currentSeason = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${sunnyWeather == sunnyWeatherToday && openCanopy == openCanopyToday && AIR_HUMIDITY == airHumidityToday && RIGHT_SEASON != currentSeason} "
    )
}