package com.example.kotlin_classes.abschluss_abgabe

/**
 * Enum class representing different book genres with descriptions.
 */
enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Non-fictional works, including biographies and essays"),
    SCIENCE("Books on scientific topics and research"),
    HISTORY("Books covering historical events and figures"),
    CHILDREN("Books suitable for children, including stories and educational materials");

    /**
     * Prints the description of the genre.
     */
    fun printDescription() {
        println(description)
    }
}
