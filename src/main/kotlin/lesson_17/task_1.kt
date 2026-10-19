package lesson_17

class Quiz(
    initialQuestion: String,
    initialAnswer: String,
    ){
    val question = initialQuestion
        get() = field

    var answer = initialAnswer
        get() = field
        set(value){
            field = value
        }
}