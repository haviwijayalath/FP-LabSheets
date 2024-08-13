import prac08.q02.categorizeNumber
import prac08.q01.enc
import prac08.q01.cypher
import prac08.q01.dec
object prac08 extends App {
  object q01 {
    val enc: (String, Int) => String = (data, shifts) => data.map(_+shifts).map(_.toChar).mkString
    val dec: (String, Int) => String = (data, shifts) => data.map(_-shifts).map(_.toChar).mkString
    def cypher(func: (String, Int) => String, data: String, key: Int): String = {
      func(data,  key)
    }
  }
  println("q01:")
  val x = "ABC"
  val encryptedData = cypher(enc, x, 1)
  val decryptedData = cypher(dec, encryptedData, 1)
  println(encryptedData)
  println(decryptedData)

  object q02 {
    val categorizeNumber = (x: Int) => x match
      case x if (x % 3 == 0 && x % 5 == 0) => "Multiple of Both Three and Five"
      case x if (x % 3 == 0) => "Multiple of Three"
      case x if (x % 5 == 0) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
  }
  println("\nq02:")
  println("9 = " + categorizeNumber(9))
  println("10 = " + categorizeNumber(10))
  println("11 = " + categorizeNumber(11))
  println("15 = " + categorizeNumber(15))
}