package lesson_11

const val TALKING = "разговаривает"
const val MICROPHONE_IS_OFF = "микрофон выключен"
const val MUTE = "пользователь заглушен"

class Room(
    val cover: String,
    val name: String,
    val listOfParticipants: MutableList<Participant> = mutableListOf(),
) {
    fun addNewParticipant(participant: Participant) {
        listOfParticipants.add(participant)
    }

    fun changeStatus(nickname: String, newStatus: String) {
        if (newStatus != TALKING && newStatus != MICROPHONE_IS_OFF && newStatus != MUTE) return
        for (participant in listOfParticipants) {
            if (participant.nickname == nickname) {
                participant.status = newStatus
                break
            }
        }
    }
}

data class Participant(
    val nickname: String,
    val avatar: String,
    var status: String,
)

fun main() {
    val room = Room("красивая обложка", "Room1")
    val participant1 = Participant("Oleg", "Котик", MICROPHONE_IS_OFF)

    room.addNewParticipant(participant1)
    room.changeStatus("Oleg", TALKING)
    println(room.listOfParticipants.joinToString(", "))
    println(participant1.status)
}