//main
@main def main(): Unit = {
  // Practical 01
  // prac01;
  println("\nOUTPUT (q01):")
  q01;

  println("\nOUTPUT (q02):")
  q02;

  println("\nOUTPUT (q03):")
  println(q03.takeHomeSalary(40, 30));

  println("\nOUTPUT (q04):")
  val a: Int = q04.profit(10)
  val b: Int = q04.profit(15)
  val c: Int = q04.profit(20)
  println(s"Rs.10 = Rs.$a\nRs.15 = Rs.$b\nRs.20 = Rs.$c")
}