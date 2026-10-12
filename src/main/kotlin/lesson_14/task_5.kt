package lesson_14

class Chat {
    private var messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(
        text: String,
        author: String,
    ): Int {
        val currentId = nextId
        nextId++

        val currentMessage = Message(currentId, author, text)
        messages.add(currentMessage)

        return currentId
    }

    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int,
    ) {
        val currentMessage = ChildMessage(parentMessageId, nextId, author, text)
        nextId++
        messages.add(currentMessage)
    }

    fun printChat() {
        val groupOfMessage = messages.groupBy { message ->
            if (message is ChildMessage) {
                message.parentMessageId
            } else {
                message.id
            }
        }
        groupOfMessage.forEach { (parentId, threadMessages) ->
            for (message in threadMessages) {
                if (message is ChildMessage) {
                    println("\t${message.author}: ${message.text}")
                } else {
                    println("${message.author}: ${message.text}")
                }
            }
        }
    }
}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    val parentMessageId: Int,
    id: Int,
    author: String,
    text: String,
) : Message(id, author, text)

fun main() {
    val chat = Chat()
    val idOfPerent = chat.addMessage("релиз", "Олег")
    chat.addThreadMessage("У тебя баг", "Вася", idOfPerent)
    chat.printChat()
}