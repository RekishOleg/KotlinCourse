package lesson_6

fun main(){
    println("Введите кол-во секунд которое нужно засечь:")
    val numberOfSeconds = readln().toInt()
    var counter = numberOfSeconds

    while (counter != 0){
        Thread.sleep(1000)
        counter--
    }
    println("Прошло ${numberOfSeconds} секунд")
}