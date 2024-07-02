import scala.annotation.static
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
        val li: List[String] = List("Sunday", "Mon", "Tues", "Wed", "Thursday", "Friday", "Saturday")
        
        def lengthMoreThan5list(l: List[String]): List[String] = l.filter(_.length() > 5)

        println(lengthMoreThan5list(li))
    }
/*
    object q02_my {
        val li: List[String] = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        
        /* 
        def moreThanLength5(l: List[String], n: Int): String = 
            l(n).size match
                case x if (x > 5) => l(n)
                case _ => null
        */
        def lengthMoreThan5(str: String): Boolean = 
            str.size match
                case x if x > 5 => true;
                case _ => false
        
        

        def lengthMoreThan5list(l: List[String], n: Int): List[String] = 
            var newl: List[String] = List()
            if (lengthMoreThan5(l(n - 1))) newl.::(l(n - 1))
            if (n > 1) lengthMoreThan5list(l, n - 1)
            newl

        println(lengthMoreThan5list(li, li.size))
    }
*/

    // 3. You are given two integers, num1 and num2. Write a function in Scala to determine the arithmetic mean (average) of the two numbers, rounded to two decimal places. Return the result as a floating-point number.

    object q03 {
        def mean(num1: Int, num2: Int): Float = 
            val avg = (num1 + num2) / 2.0
            BigDecimal(avg).setScale(2).toFloat
    } 

    // 4.Write a function in Scala that takes a list of integers as input and returns the sum of all the even numbers in the list.

    object q04 {
        val li: List[Int] = List(1, 2, 3, 4, 5)

        def sumOfEvens(l: List[Int], n: Int): Int = 
            if (n > 1) {
                l(n - 1) match
                    case x if x % 2 == 0 => l(n - 1) + sumOfEvens(l, n - 1)
                    case _: Int => sumOfEvens(l, n - 1)
            } else {
                0
            }

        println(sumOfEvens(li, li.size))
    }

}

