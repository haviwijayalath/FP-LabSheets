object prac05 {
    object q01 {
        def getProductList(productList: List[String]): List[String] = 
            val product = scala.io.StdIn.readLine()
            if (product == "done") return productList
            val tempproductList = productList.:+(product)
            getProductList(tempproductList)

        def printList(list: List[Any], len: Int): Unit = 
            if (len > 1) printList(list, len - 1)
            println(len + ". " + list(len - 1))

        def printProductList(productList: List[String]): Unit = printList(productList, productList.length)

        def getTotalProducts(productList: List[String]): Unit = println("Number of products: " + productList.length)
    }

    object q02 {
        case class Book(title: String, author:String, isbn: String)

        var lib: Set[Book] = Set(
                Book("1984", "George Orwell", "ISBN-123"),
                Book("To Kill a Mockingbird", "Harper Lee", "ISBN-456"),
                Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN-789")
            )

        def add(newBook: Book): Unit = 
            lib += newBook
            println(s"\"${newBook.title}\" book added successfully!")

        def del(isbn: String): Unit = 
            lib = lib.filter(_.isbn != isbn)
            println(s"Book removed successfully!")

        def isBookExist(isbn: String): Unit = 
            if (lib.exists(_.isbn == isbn)) println("Book exists")
            else println("Book does not exist")

        def displayBookList(): Unit = 
            lib.foreach(book => println(s"Title: ${book.title} Author: ${book.author} ISBN: ${book.isbn}"))

        def search(title: String): Unit = 
            println(lib.filter(_.title == title))
    }

    object q03 {
        def fib(n: Int): Int = 
            n match
                case 1 => 1
                case 0 => 0
                case _ => fib(n - 1) + fib(n - 2)

        def fibSeq(n: Int): Unit = 
            if (n > 0) fibSeq(n - 1)
            print(s"${fib(n)}, ")
    }
}