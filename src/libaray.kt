class Library{
    private val  books= mutableListOf<Book>()
    fun addBook(book: Book){
        books.add(book)
        println("Added: ${book.title}")
    }
    fun barrowBook(isbn: String) : Boolean{
        val book= books.find { it.isbn== isbn && it.isAvaliable }
        return if(book != null) {
            book.isAvaliable=true
            println("Returned: ${book.title}")
            true
        }else{
            println("Book not found in borrowed list")
            false
        }
    }
    fun returnBook(isbn: String) : Boolean {
        val book = books.find { it.isbn== isbn && !it.isAvaliable}
        return if (book !=null){
            book.isAvaliable=true
            println("Returned: ${book.title}")
            true
        }else{
            println("Book not found in barrowed lists")
            false
        }
    }
    fun listAvaliableBooks(){
        val available = books.filter { it.isAvaliable }
        println("Available books:")
        available.forEach { println("- ${it.title} by ${it.author}") }
    }

}