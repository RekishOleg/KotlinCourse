package lesson_11

class Forum() {
    private val members: MutableList<ForumMember> = mutableListOf()
    private var nextUserId = 0

    private val messages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): ForumMember {
        nextUserId++
        val member = ForumMember.Builder()
            .userId(nextUserId)
            .userName(name)
            .build()
        members.add(member)
        return member
    }

    fun createNewMessage(id: Int, text: String): ForumMessage? {
        if (members.find { it.userId == id } == null) {
            return null
        }
        val message = ForumMessage
            .Builder()
            .authorId(id)
            .message(text)
            .build()
        messages.add(message)
        return message
    }

    fun printThread() {
        for (message in messages) {
            val author = members.find { it.userId == message.authorId } ?: continue
            println("${author.userName}: ${message.message}")
        }
    }
}

class ForumMember private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        private var userId = 0
        private var userName: String = ""

        fun userId(value: Int): Builder {
            userId = value
            return this

        }

        fun userName(value: String): Builder {
            userName = value
            return this
        }

        fun build(): ForumMember {
            return ForumMember(userId, userName)
        }
    }
}


class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId = 0
        private var message: String = ""

        fun authorId(value: Int): Builder {
            authorId = value
            return this
        }

        fun message(value: String): Builder {
            message = value
            return this
        }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("test1")
    val user2 = forum.createNewUser("test2")
    forum.createNewMessage(user1.userId, "привет!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Привет! Нормально")
    forum.createNewMessage(user2.userId, "Как твои дела?")
    forum.printThread()
}