package com.example.kotlin_classes.abschluss_abgabe

/**
 * Sealed class representing the status of a book.
 */
sealed class BookStatus {

    /**
     * The book is available for checkout.
     */
    object Available : BookStatus() {
        override fun getStatusDescription(): String = "The book is available."
    }

    /**
     * The book is checked out, with a due date.
     * @property dueDate The due date for return.
     */
    data class CheckedOut(val dueDate: String) : BookStatus() {
        override fun getStatusDescription(): String = "The book is checked out and due back on $dueDate."
    }

    /**
     * The book is reserved by a user.
     * @property reservedBy The user who reserved the book.
     */
    data class Reserved(val reservedBy: String) : BookStatus() {
        override fun getStatusDescription(): String = "The book is reserved by $reservedBy."
    }

    /**
     * Returns a description of the book's status.
     */
    abstract fun getStatusDescription(): String
}
