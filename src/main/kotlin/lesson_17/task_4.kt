package lesson_17

class Package(
    val number: Int,
    initialLocation: String,
) {
    private var _displacementCounter: Int = 0
    val displacementCounter: Int
        get() = _displacementCounter
    var location = initialLocation
        set(value){
            field = value
            _displacementCounter += 1
        }

}

fun main() {
    val package1 = Package(1, "Астана")
    println(package1.displacementCounter)
    package1.location = "Петрозаводск"
    println(package1.displacementCounter)
}