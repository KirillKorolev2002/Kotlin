package org.example.`Lesson 15`


fun main() {
    val temperatureData = Temperature(25.0)
    val precipitationData = PrecipitationAmount(10.0)
    val weatherServer = WeatherServer()
    weatherServer.sendData(temperatureData)
    weatherServer.sendData(precipitationData)
}

private abstract class WeatherStationStats {
    abstract fun getData(): String
}

private class Temperature(private val temperature: Double) : WeatherStationStats() {
    override fun getData(): String {
        return temperature.toString()
    }
}

private class PrecipitationAmount(private val amount: Double) : WeatherStationStats() {
    override fun getData(): String {
        return amount.toString()
    }
}

private class WeatherServer {
    fun sendData(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> println("Отправляем данные о температуре: ${weatherData.getData()}")
            is PrecipitationAmount -> println("Отправляем данные о количестве осадков: ${weatherData.getData()}")
            else -> println("Неизвестный тип метеоданных")
        }
    }
}

