import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import prac06.q02.getStudentInfo

object prac06 extends App {
  object q01 {
    val inventory01 = Map(
      101 -> ("p01", 10, 100),
      102 -> ("p02", 11, 200),
      103 -> ("p03", 23, 210)
    )

    val inventory01ProductNames = inventory01.values.map( x => x(0) ).toList
    val inventory01TotalValue = inventory01.values.map( x => x(1) * x(2) ).sum
    val inventory01IsEmpty = inventory01.isEmpty
    println(s"Inventory01\n Products = ${inventory01ProductNames}\n Total value = ${inventory01TotalValue}\n isEmpty = ${inventory01IsEmpty}")

    val inventory02 = Map(
      102 -> ("p02", 10, 220),
      104 -> ("p04", 23, 210)
    )

    val finalInventory = (inventory01.keys ++ inventory02.keys).map(key => 
      val (n1, q1, p1) = inventory01.getOrElse(key, ("", 0, 0))
      val (n2, q2, p2) = inventory02.getOrElse(key, ("", 0, 0))
      key -> (if (n1 == "") n2 else n1, q1 + q2, math.max(p1, p2))
    ).toMap
    println(finalInventory)

    val p102 = if (inventory01.contains(102)) println(inventory01(102)) else println("No Entry!")
  }

  object q02 {
    def getStudentInfo: (String, Int, Int, Char) = 
      print("Name: ")
      val name = readLine()
      print("Marks: ")
      val marks = readInt()
      print("Total Possible marks: ")
      val totalPossibleMarks = readInt()
      if (validateInput(name, marks, totalPossibleMarks)) getStudentInfoWithRetry
      else {
        val grd = grade(marks, totalPossibleMarks)
        (name, marks, totalPossibleMarks, grd)
      }

    def validateInput(name: String, marks: Int, totalPossibleMarks: Int): Boolean = 
      if (name == "") true
      else if (marks < 0 || totalPossibleMarks < 0) true
      else false

    def getStudentInfoWithRetry: (String, Int, Int, Char) = 
      println("Error with the previous input. Name cannot be empty. marks cannot be negative.")
      print("Name: ")
      val name = readLine()
      print("Marks: ")
      val marks = readInt()
      print("Total Possible marks: ")
      val totalPossibleMarks = readInt()
      if (validateInput(name, marks, totalPossibleMarks)) getStudentInfoWithRetry
      else {
        val grd = grade(marks, totalPossibleMarks)
        (name, marks, totalPossibleMarks, grd)
      }

    def grade(marks: Int, totalPossibleMarks: Int): Char = 
      val percentage = ( marks / totalPossibleMarks ) * 100
      percentage match
        case p if (p >= 90) => 'A'
        case p if (p >= 75) => 'B'
        case p if (p >= 50) => 'C'
        case p if (p < 50) => 'D'

    def printStudentRecord(student: (String, Int, Int, Char)): Unit = 
      val (name, marks, totalPossibleMarks, grade) = student
      println(s"Name: $name\nMarks: $marks\nPossible total: $totalPossibleMarks\nGrade: $grade")

    // alternative way
    def getStudentInfoAlt(): (String, Int, Int, Char) = 

      def getName: String = 
        print("Name: ")
        val n = readLine()
        n

      def getMarks(): Int = 
        print("Marks: ")
        val m = readInt()
        m

      def getTotalPossibleMarks(): Int = 
        print("Total Possible marks: ")
        val m = readInt()
        m
      
      var name: String = ""
      var marks: Int = 0
      var totalPossibleMarks: Int = 0
      var grade: Char = 'X'
      
      while {
        name = getName
        if (name.isEmpty) println("Err: Name cannot be empty")
        name.isEmpty()
      } do ()

      while {
        marks = getMarks()
        if (marks < 0) println("Err: Marks cannot be negative")
        marks < 0
      } do ()

      while {
        totalPossibleMarks = getTotalPossibleMarks()
        if (totalPossibleMarks < 0) println("Err: Marks cannot be negative")
        totalPossibleMarks < 0
      } do ()

      val percentage = ( marks / totalPossibleMarks ) * 100

      grade = percentage match
        case p if (p >= 90) => 'A'
        case p if (p >= 75) => 'B'
        case p if (p >= 50) => 'C'
        case p if (p < 50) => 'D'

      (name, marks, totalPossibleMarks, grade)
  }

}