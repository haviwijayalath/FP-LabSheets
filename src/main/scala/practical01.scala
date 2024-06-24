//1. Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?

def area(r: Int): Double = 3.14*r*r

//2. The temperature is 35C; convert this temperature into Fahrenheit. ºF =ºC * 1.8000 + 32.00

def toF(t: Int): Double = t * 1.8000 + 32.00


//3. The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

def volOfaSphere(r: Int): Double = 4.0/3*3.14*r*r*r


//4. Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75 cents for each additional copy. What is the total wholesale cost for 60 copies?

def bookCost(noOfBooks: Int): Double = ((24.95*noOfBooks)*60.0/100)+shipCost(noOfBooks)
def shipCost(noOfBooks: Int): Double = if (noOfBooks <= 50) 3*noOfBooks else 3*50 + 0.75*(noOfBooks-50)


//5. I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 min per km) and 2 km at easy pace again to reach home. What is the total running time?

val runtime: Int = 2*(2*8)+3*7


object prac01 {
    println(area(5))
    println(toF(35))
    println(volOfaSphere(5))
    println(bookCost(60)) 
    println(runtime)
}