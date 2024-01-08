package com.sonlit.kumandra

class EnglishUtility {

    /**
     * Lovely Error Page when assuming I know the page index:
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/replaceFirstChar.html
     * actually is:
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/replace-first-char.html
     */
    fun capitalize(str: String) = str.replaceFirstChar(Char::uppercase)
}
