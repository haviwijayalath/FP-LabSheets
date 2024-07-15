import scala.compiletime.ops.string
object prac04{
    object q01 {
        val item_name: Array[String] = Array("a", "b", "c")
        val item_qty: Array[Int] = Array(1, 2, 3)

        def displayInventory(n: Int): Unit = 
            if (n > 1) displayInventory(n - 1)
            println(s"${item_name(n - 1)} - ${item_qty(n - 1)}")

        def restockItem(name: String, qty: Int): Unit = 
            var i = 0
            item_name.contains(name) match
                case false => println("Item is not in the item list")
                case true => 
                    for (nm <- item_name) {
                        if (nm == name) item_qty(i) = qty
                        else i += 1
                    }
            
        restockItem("d", 10)
        displayInventory(item_name.length)
    }

    object q02 {
        def patternMatching(n: Int): Unit = n match 
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
}