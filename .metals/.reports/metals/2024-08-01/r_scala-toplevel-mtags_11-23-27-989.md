error id: file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/practical06.scala:[1464..1465) in Input.VirtualFile("file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/practical06.scala", "import scala.io.StdIn.readLine

object practical06 extends App{

    var inven = addProduct();
    

}



object inventrySystem{
    
    case class product(name:String, quantity:Int, price:Double)

    type Inventory = Map[Int,product]

    // var inventory1 : Inventory = Map(
    //     101 -> product("product1", 10, 15.5),
    //     102 -> product("product2", 5, 12.0),
    //     103 -> product("product3", 20, 25.0)
    // )

    // var inventory2 : Inventory = Map(
    //     101 -> product("product2", 7, 14.0),
    //     104 -> product("product4", 3, 30.0),
    // )

    def addProduct():Inventory = {
        var inventory: Inventory = Map()
        var continue = true
        while(continue){
            println("Enter product ID")
            val id = readLine().toInt
            println("Enter product name: ")
            val name = readLine()
            println("Enter product quantity: ")
            val quantity = readLine().toInt
            println("Enter product price: ")
            val price = readLine().toDouble

            inventory = inventory + (id -> product(name,quantity,price))

            println("Do you want to add another product? (y/n)")
            continue = readLine().toLowerCase == 'y'
        }
        inventory    
    }

    def retrieveAllProductNames(inventory: Inventory): List[String] = {
        inventory.values.map(_.name).toList
    }

    def
}")
file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/practical06.scala
file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/practical06.scala:55: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace