package lesson_12

import kotlin.random.Random


class StatisticsOfWeather(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean,
)

fun main() {
    val rangeOfNumbersForDay = 10..20
    val rangeOfNumbersForNight = -10..9
    val listOfWeather = mutableListOf<StatisticsOfWeather>()
    for (i in 1..30) {
        listOfWeather.add(
            StatisticsOfWeather(
                dayTemperature = rangeOfNumbersForDay.random(),
                nightTemperature = rangeOfNumbersForNight.random(),
                isPrecipitation = Random.nextBoolean()
            )
        )
    }
    val listOfDayTemperature = listOfWeather.map { it.dayTemperature }
    val listOfNightTemperature = listOfWeather.map { it.nightTemperature }
    val countOfPrecipitations = listOfWeather.count { it.isPrecipitation == true }
    val averageDayTemperature = listOfDayTemperature.average()
    val averageNightTemperature = listOfNightTemperature.average()
    println(
        """
        Кол-во дней с осадками: $countOfPrecipitations
        Средняя дневная температура: $averageDayTemperature
        Средняя ночная температура: $averageNightTemperature
    """.trimIndent()
    )


}