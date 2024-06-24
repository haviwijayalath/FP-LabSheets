object q01 {
    val k = 2; val i = 2; val j = 2;
    val m = 5; val n = 5;
    val f = 12.0f; val g = 4.0f;
    val c = 'X';

    println(k + 12 * m);
    println(m / j);
    println(n % j);
    println(m / j * j);
    println(f + 10 * 5 + g);
}

object q02 {
    /* Java:
    int a = 2, b = 3, c = 4, d = 5;
    float k = 4.3f;
    */
    var a: Int = 2; var b: Int = 3; var d: Int = 5;
    var c: Int = 4; 
    val k: Float = 4.3f;
    val g = 4.0f;

    /* Java:
        println( - -b * a + c *d - -);
        println(a++);
        println (–2 * ( g – k ) +c);
        println (c=c++);
        println (c=++c*a++);
    */
    b = b - 1;
    println(b * a + c * d);
    d = d - 1;

    println(a);
    a = a + 1;

    println (-2 * ( g - k ) + c);

    println(c);

    c = c + 1;
    c = c * a;
    println(c);
    a = a + 1;
}

object q03 {
    val normalPay: Int = 250;
    val otPay: Int = 85;
    def grosspay(workingHours: Int, ot: Int): Double = normalPay * workingHours + otPay * ot;
    def tax(workingHours: Int, ot: Int): Double = grosspay(workingHours, ot) * 0.12;
    def takeHomeSalary(workingHours: Int, ot: Int): Double = grosspay(workingHours, ot) - tax(workingHours, ot);
}

object q04 {
    def attendees(ticketPrice: Int): Int = 120 + (15 - ticketPrice) / 5 * 20
    def cost(ticketPrice: Int): Int = 500 + 3 * attendees(ticketPrice)
    def revenue(ticketPrice: Int): Int = ticketPrice * attendees(ticketPrice)
    def profit(ticketPrice: Int): Int = revenue(ticketPrice) - cost(ticketPrice)
}