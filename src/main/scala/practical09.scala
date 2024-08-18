object prac09 extends App {
  object q01 {
    val interest: Double => Double = deposit => {
      val rates: List[Double => Double] = List(
        (x: Double) => if (x <= 20000) 0.02 * x else 0,
        (x: Double) => if (x > 20000 && x <= 200000) 0.04 * x else 0,
        (x: Double) => if (x > 200000 && x <= 2000000) 0.035 * x else 0,
        (x: Double) => if (x > 2000000) 0.065 * x else 0 
      )
      rates.map(_(deposit)).sum
    }
  }

  object q02 {
    val patternMatching = (n: Int) => n match 
      case x if x <= 0 => println("Negative/Zero")
      case x if x % 2 == 0 => println("Even")
      case _ => println("Odd")
  }

  object q03 {
    def stringFormatter(name: String, format: String => String): String = format(name)

    val formatedName1 = stringFormatter("Benny", _.toUpperCase())
    val formatedName2 = stringFormatter("Niroshan", name => name(0).toUpper.toString() + name(1).toUpper.toString() + name.substring(2, name.length))
    val formatedName3 = stringFormatter("Saman", _.toLowerCase())
    val formatedName4 = stringFormatter("Kumara", name => name(0).toUpper.toString() + name.substring(1, name.length - 1) + name(name.length - 1).toUpper.toString())
    
    println(formatedName1)
    println(formatedName2)
    println(formatedName3)
    println(formatedName4)
  }

  println("q01:")
  println(q01.interest(220020.00) + "\n")
  println("q02:")
  q02.patternMatching(-345)
  println("\nq03:")
  q03
}