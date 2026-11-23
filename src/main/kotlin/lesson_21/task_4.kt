package lesson_21

import java.io.File

fun File.wordToFile(word: String) {
    if (word.isEmpty()) return
    val newWord = word.lowercase()
    val text = if (exists()) readText() else ""
    this.writeText("$newWord\n$text")
}
