package lesson_4

const val airHumidity = 20
const val rightSeason = "Не зима"

fun main() {
    val sunnyWeather = true
    val openCanopy = true
    val sunnyWeatherToday = true
    val openCanopyToday = true
    val airHumidityToday = 20
    val currentSeason = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${sunnyWeather == sunnyWeatherToday && openCanopy == openCanopyToday && airHumidity == airHumidityToday && rightSeason == currentSeason} "
    )
}