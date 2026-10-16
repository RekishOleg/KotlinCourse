package lesson_15

abstract class WeatherStationStats(
    val value: Int,
) {
    abstract fun showValue(): String
}

class Temperature(
    temperature: Int
) : WeatherStationStats(temperature) {
    override fun showValue(): String = "$value °C"
}


class PrecipitationAmount(
    precipitationAmount: Int,
) : WeatherStationStats(precipitationAmount) {
    override fun showValue(): String = "$value мм"
}


class WeatherServer(
    val temperature: WeatherStationStats,
    val precipitationAmount: WeatherStationStats,

    ) {
    fun sendToServer() {
        println("Отправка данных на сервер:")
        println(temperature.showValue())
        println(precipitationAmount.showValue())
    }
}

fun main() {
    val server = WeatherServer(
        Temperature(20),
        PrecipitationAmount(10)
    )
    server.sendToServer()

}