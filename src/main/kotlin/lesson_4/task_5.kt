package lesson_4

fun main() {
    val maxCrew = 70
    val minCrew = 55
    val minNumberOfBoxes = 50
    val recommendedCrew = 70
    val recommendedWeather = true


    print("Введите наличие повреждений корпуса: ")
    val isDamageOnCurrentShip = readLine().toBoolean()

    print("Введите текущий состав экипажа: ")
    val currentCrew = readLine()!!.toInt()

    print("Введите кол-во ящиков с провизией на борту: ")
    val currentNumberOfBoxes = readLine()!!.toInt()

    print("Введите погодные условия(Благоприятно/Неблагоприятно): ")
    val currentWeatherCondition = readLine().toBoolean()

    val noDamage = !isDamageOnCurrentShip
    val crewInRange = currentCrew in minCrew..maxCrew
    val boxesStrictlyAboveMin = currentNumberOfBoxes > minNumberOfBoxes
    val startNoDamage = noDamage && crewInRange && boxesStrictlyAboveMin


    val hasDamage = isDamageOnCurrentShip
    val crewMatchesRecommended = currentCrew == recommendedCrew
    val weatherMatchesRecommended = currentWeatherCondition == recommendedWeather
    val boxesAtLeastMin = currentNumberOfBoxes >= minNumberOfBoxes
    val startWithDamage = hasDamage && crewMatchesRecommended && weatherMatchesRecommended && boxesAtLeastMin

    println("Корабль может отплыть: ${startWithDamage || startNoDamage}")


}