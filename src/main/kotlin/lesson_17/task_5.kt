package lesson_17

class User(
    initialLogin: String,
    initialPassword: String,
) {
    var password = initialPassword
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
    var login = initialLogin
        set(value){
            println("Логин успешно изменен")
            field = value
        }

}
fun main(){
    val user = User("Oleg", "abc123")
    println(user.password)
    user.password = "456"
    user.login = "OlegRekish"
    println(user.login)
}