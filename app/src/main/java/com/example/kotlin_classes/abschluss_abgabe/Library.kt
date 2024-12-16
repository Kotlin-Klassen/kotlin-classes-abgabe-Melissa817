package com.example.kotlin_classes.abschluss_abgabe

/**
 * Class representing a library with books and members.
 */
class Library {
    private val books = mutableListOf<Book>()

    /**
     * Nested class representing the address of the library.
     * @property street The street of the library.
     * @property city The city of the library.
     * @property zipCode The zip code of the library.
     */
    class LibraryAddress(private val street: String, private val city: String, private val zipCode: String) {
        /**
         * Prints the address of the library.
         */
        fun printAddress() {
            println("Library Address: $street, $city, $zipCode")
        }
    }

    /**
     * Inner class representing a library member.
     * The inner class has access to the books in the library.
     * @property name The name of the library member.
     * @property memberID The ID of the library member.
     */
    inner class LibraryMember(val name: String, val memberID: String) {
        /**
         * Checks out a book if it is available.
         * @param book The book to be checked out.
         * @param dueDate The due date for the book return.
         */
        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("Book '${book.title}' checked out by $name. Due date: $dueDate.")
            } else {
                println("Book '${book.title}' is not available for checkout.")
            }
        }

        /**
         * Reserves a book if it is available.
         * @param book The book to be reserved.
         */
        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("Book '${book.title}' reserved by $name.")
            } else {
                println("Book '${book.title}' cannot be reserved.")
            }
        }
    }

    /**
     * Adds a new book to the library collection.
     * @param book The book to be added.
     */
    fun addBook(book: Book) {
        books.add(book)
        println("Book '${book.title}' by ${book.author} added to the library.")
    }

    /**
     * Searches for books by title or author.
     * @param query The search query to filter books by title or author.
     * @return A list of books that match the search query.
     */
    fun searchBooks(query: String): List<Book> {
        return books.filter { it.title.contains(query, ignoreCase = true) || it.author.contains(query, ignoreCase = true) }
    }

    /**
     * Displays the status of all books in the library.
     */
    fun displayBookStatuses() {
        if (books.isEmpty()) {
            println("No books in the library.")
        } else {
            for (book in books) {
                println("Title: ${book.title}, Author: ${book.author}, Status: ${book.status.getStatusDescription()}")
            }
        }
    }
}
