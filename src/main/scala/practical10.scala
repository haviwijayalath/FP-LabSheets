object prac10 extends App {

  // rational number class
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must be non-zero")

    private val g = gcd(n, d)
    val numer = n / g
    val denom = d / g

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def neg: Rational = new Rational(-this.numer, this.denom)

    def sub(that: Rational): Rational = new Rational(this.numer * that.denom - that.numer * this.denom, this.denom * that.denom)

    override def toString(): String = numer + "/" + denom
  }

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  println(x.sub(y).sub(z).toString())


  // account class
  class Account(n: Int, b: Double) {
    val accountNumber = n
    val balance = b

    def deposit(amount: Double) = 
      this.balance + amount
      println("Deposited: " + amount + " New Balance: " + this.balance)

    def withdraw(amount: Double) = 
      this.balance - amount
      println("Withdrawn: " + amount + " New Balance: " + this.balance)

    def transfer(amount: Double, that: Account) = {
      this.withdraw(amount)
      that.deposit(amount)
      println("Transferred: " + amount + " New Balance: " + this.balance)
    }
  }

  // bank
  val bank: List[Account] = List(
    new Account(0, 100.00),
    new Account(1, -15.50),
    new Account(2, 500.00),
    new Account(3, -10.00)
  )

  val negativeAccs: List[Account] => List[Account] = allAccs => allAccs.filter(_.balance < 0)
  val sumOfAllAccs: List[Account] => Double = allAccs => allAccs.map(_.balance).sum
  val applyInterest: List[Account] => List[Account] = allAccs => {
    allAccs.map(acc => {
      if (acc.balance > 0) {
        val newBalance = acc.balance + (acc.balance * 0.05)
        new Account(acc.accountNumber, newBalance)
      } else {
        val newBalance = acc.balance + (acc.balance * 0.1)
        new Account(acc.accountNumber, newBalance)
      }
    })
  }

  val updatedBank = applyInterest(bank)
  updatedBank.foreach(acc => println(s"Account ${acc.accountNumber}: Balance ${acc.balance}"))
}