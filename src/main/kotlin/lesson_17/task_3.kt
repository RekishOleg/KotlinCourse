package lesson_17

class Folder(
    private val realName: String,
    private val realNumberOfFiles: Int,
    val isSecret: Boolean,
) {
    val name: String
        get() {
            if (isSecret) {
                return "скрытая папка"

            } else return realName

        }
    val numberOfFiles: Int
        get() {
            if (isSecret) {
                return 0
            } else return realNumberOfFiles
        }
}

fun main() {
    val secret = Folder("Документы", 12, true)
    println(secret.name)
    println(secret.numberOfFiles)
}