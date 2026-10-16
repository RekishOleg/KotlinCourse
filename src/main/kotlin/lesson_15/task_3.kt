package lesson_15

abstract class User(
    val name: String,
) {
    fun readForum() {
        println("$name: Читаю форум")
    }
    fun writeMessage() {
        println("$name: Пишу сообщение")
    }
}

class SimpleUser(
    name: String,
) : User(name)

class Administrator(
    name: String,
) : User(name) {

    fun deleteMessage() {
        println("$name(Администратор) - удалил сообщение")
    }

    fun deleteUser() {
        println("$name(Администратор) - удалил пользователя")
    }
}

fun main() {
    val simpleUser = SimpleUser("Саша")
    val administrator = Administrator("Олег")

    simpleUser.writeMessage()
    simpleUser.readForum()

    administrator.writeMessage()
    administrator.readForum()
    administrator.deleteUser()
    administrator.deleteMessage()
}