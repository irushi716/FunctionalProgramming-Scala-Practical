object Fibonacci {
  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacciNumbers(n: Int,i:Int = 0): Unit = {
      if (i < n) {
        print(s"${fibonacci(i)} ")
        printFibonacciNumbers(n,i + 1)
      }
  }
}


case class Book(title: String, author: String, isbn: String)

object LibraryManagement {
  var library :Set[Book] = Set(
    Book("1999","George Orwell","1234567890"),
    Book("Madol Duwa","Martin Wickramasinghe","2345678901"),
    Book("The Great Gatsby","F.Scott Fitzgerald","3456789012")
  )

  def addBook(book:Book):Unit = {
    library += book
    println(s"Book added: ${book.title}")
  }

  def removeBook(isbn: String): Unit = {
    val initialSize = library.size
    library = library.filterNot(b => b.isbn == isbn) 
    if (library.size < initialSize) {
      println(s"Book with ISBN $isbn removed.")
    } else {
      println(s"No book found with ISBN $isbn.")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Current library collection:")
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title '$title'.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author '$author'.")
    }
  }
}

object inventryManagement {
  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    println("Enter product name (type 'done' to finish)  :   ")
    while(input != "done"){
      input = scala.io.StdIn.readLine()
      if(input != "done" && input.nonEmpty){
        products = products :+ input
      }
    }
    products
  }

  def printProductList(l:List[String],i:Int = 0):Unit = {
    if(i < l.length){
      println(s"${i + 1}\t-\t${l(i)}")
      printProductList(l, i + 1)
    }
  }

  def getTotalProducts(l:List[String]) : Unit = {
    println(s"Total number of products\t:\t${l.length}")
  }
}



object practical05 extends App {
  var productList = inventryManagement.getProductList();
  inventryManagement.printProductList(productList)
  inventryManagement.getTotalProducts(productList)


//  LibraryManagement.displayLibrary()
//  var book : Book = Book("the one","Irushi","4567843234")
//  LibraryManagement.addBook(book)
//  LibraryManagement.displayLibrary()
//  LibraryManagement.removeBook("4567843234")
//  println(s"Book - 2345678902 is : ${LibraryManagement.isBookInLibrary("2345678902")}")
//  LibraryManagement.searchByTitle("Madol Duwa")
//  LibraryManagement.displayBooksByAuthor("Martin Wickramasinghe")


  //Fibonacci.printFibonacciNumbers(8)
}
