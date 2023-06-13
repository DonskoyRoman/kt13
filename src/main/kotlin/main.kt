package ru.netology

fun main() {
    val seconds = 6969


    val text = agoToText(seconds)
    println(text)
}

fun agoToText(seconds: Int): String {
    return when {
        seconds < 60 -> "был(а) только что"
        seconds < 60 * 60  -> "${minutesToText(seconds / 60)} назад"
        seconds < 24 * 60 * 60  -> "${hoursToText(seconds / (60 * 60))} назад"
        seconds < 2 * 24 * 60 * 60   -> "вчера"
        seconds < 3 * 24 * 60 * 60  -> "позавчера"
        else -> "давно"
    }
}

fun minutesToText(minutes: Int): String {
    return when (minutes) {
        1, 21, 31, 41, 51 -> "$minutes минуту"
        in 2..4, in 22..24, in 32..34, in 42..44, in 52..54 -> "$minutes минуты"
        else -> "$minutes минут"
    }
}

fun hoursToText(hours: Int): String {
    return when (hours) {
        1, 21 -> "$hours час"
        in 2..4, in 22..24 -> "$hours часа"
        else -> "$hours часов"
    }
}



