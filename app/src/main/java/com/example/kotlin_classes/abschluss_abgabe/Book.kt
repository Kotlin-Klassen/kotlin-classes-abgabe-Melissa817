package com.example.kotlin_classes.abschluss_abgabe

/**
 * Data class representing a book with relevant information.
 * @property title The title of the book.
 * @property author The author of the book.
 * @property genre The genre of the book, represented by an instance of the [Genre] enum class.
 * @property status The current status of the book, represented by an instance of the [BookStatus] sealed class.
 */
data class Book(
    var title: String,
    var author: String,
    var genre: Genre,
    var status: BookStatus
)
