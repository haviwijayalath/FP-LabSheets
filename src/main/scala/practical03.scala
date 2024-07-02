object prac03 {
    // 1. Write a function in Scala that takes a string as input and returns the reverse of the string using a recursive approach.

    object q01 {
        print("Enter a string: ")
        val str: String = scala.io.StdIn.readLine()
        reverseString(str, str.size)

        def reverseString(str: String, n: Int): Unit = 
            print(str(n - 1))
            if (n > 1) reverseString(str, n - 1)
    }

    // 2. Write a function in Scala that takes a list of strings as input and returns a new list containing only the strings that have a length greater than 5.

    object q02 {
        val l: List[String] = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

        def moreThanLength5(l: List[String], n: Int): String = 
            l(n).size match
                case x if (x > 5) => l(n)
                case _ => null
            
        def lengthMoreThan5(str: String): Boolean = 
            
        
        def mm(l: List[String], n: Int): List[String] = 
            var newl: List[String] = List()
            if (lengthMoreThan5(l(n))) newl.::(l(n))

    }

    // 3. You are given two integers, num1 and num2. Write a function in Scala to determine the arithmetic mean (average) of the two numbers, rounded to two decimal places. Return the result as a floating-point number.



    // 4.Write a function in Scala that takes a list of integers as input and returns the sum of all the even numbers in the list.


}

