import scala.io.StdIn.readLine

object prac07{
  object q01 {
    val filterEvenNumbers: List[Int] => List[Int] = inL => inL.filter(n => n % 2 == 0)

    // val inputList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val input: List[String] = readLine.split(' ').toList
    val inputList: List[Int] = input.map( n => n.toInt )

    println(filterEvenNumbers(inputList))
  }

  object q02 {
    val calculateSquare: List[Int] => List[Int] = inL => inL.map(n => n * n)

    val input: List[Int] = List(1, 2, 3, 4, 5)
    println(calculateSquare(input))
  }

  object q03 {
    val filterPrime = (inList: List[Int]) => inList.filter(n => (n > 1 && !(2 until n).exists(x => n % x == 0) || n == 2))

    val input: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterPrime(input))
  }
}