
fun main(){
    val b= Book(isbn = "AA", title = "abc", author = "test",isAvaliable = true)
    val b1= Book(isbn = "AA1", title = "abc1", author = "test",isAvaliable = false)
    val b2= Book(isbn = "AA2", title = "abc2", author = "test2",isAvaliable = true)
    var lists = Library()
    lists.addBook(b)
    lists.addBook(b1)
    lists.addBook(b2)

    lists.barrowBook(b1.isbn)

    lists.listAvaliableBooks()
}