package org.example.miniAssignment

class Book(val bookId:Int, val title: String, val author: String){}

class Library {

    private val books = mutableListOf<Book>()
    var bookFound: Boolean = false

    fun addBook(book: Book) {
        books.add(book)
        println("\"${book.title}\" added successfully.")
    }

    fun removeBook(bookId: Int) {
        val book = books.find { it.bookId == bookId }

        if (book != null) {
            books.remove(book)
            println("Book removed successfully.")
        } else {
            println("Book not found.")
        }
    }

    fun showBooks() {
        if (books.isEmpty()) {
            println("Library is empty.")
            return
        }

        println("\nAvailable Books:")
        for ((index, book) in books.withIndex()) {
            println("${index + 1}. ${book.title} by ${book.author}")
        }
    }
}

fun main() {

    val library = Library()

    library.addBook(Book(1, "The Alchemist", "Paulo Coelho"))
    library.addBook(Book(2, "1984", "George Orwell"))
    library.addBook(Book(3, "Atomic Habits", "James Clear"))

    library.showBooks()

    library.removeBook(1)

    library.showBooks()
}