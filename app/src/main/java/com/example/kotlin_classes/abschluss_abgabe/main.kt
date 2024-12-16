package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    val library = Library()

    val book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION, BookStatus.Available)
    val book2 = Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available)
    val book3 = Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", Genre.FICTION, BookStatus.Available)

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    println("\nGenre Descriptions:")
    Genre.FICTION.printDescription()
    Genre.NON_FICTION.printDescription()
    Genre.SCIENCE.printDescription()
    Genre.HISTORY.printDescription()
    Genre.CHILDREN.printDescription()

    val libraryAddress = Library.LibraryAddress("123 Main St", "Booktown", "12345")
    libraryAddress.printAddress()

    val member = library.LibraryMember("Alice", "M001")

    member.checkoutBook(book1, "2024-12-30")
    member.reserveBook(book2)

    println("\nCurrent Book Statuses after checkout and reservation:")
    library.displayBookStatuses()

    println("\nSearch for books containing 'History':")
    val searchResults = library.searchBooks("History")
    searchResults.forEach { book ->
        println("Found Book: ${book.title} by ${book.author}")
    }

    println("\nTry to checkout 'The Great Gatsby' again:")
    member.checkoutBook(book1, "2024-12-30")
}
