object InventoryManagement{
  var itemNames: Array[String] = Array("Apple", "Mango", "Banana", "Orange", "Papaya")
  var itemQuantities: Array[Int] = Array(20,30,10,30,15);
  
  def displayInventory(i:Int):Unit = if(i<itemNames.length){
    println(s"${itemNames(i)}:\t${itemQuantities(i)}")
    displayInventory(i+1)
  }

  def reStockItem(itName: String, itQuantity: Int, i: Int): Unit = {
    if (i < itemNames.length) {
      if (itName == itemNames(i)) {
        itemQuantities(i) += itQuantity
        println(s"New Quantity of the $itName is ${itemQuantities(i)}")
      } else {
        reStockItem(itName, itQuantity, i + 1)
      }
    } else {
      
      println(s"Item ${itName} does not exist")
    }
  }

  def sellItem(itName:String, itQuantity:Int, i:Int):Unit = {
    if(i < itemNames.length){
      if (itName == itemNames(i)) {
        if(itemQuantities(i)>=itQuantity){
          itemQuantities(i) -= itQuantity
          println(s"You can buy $itQuantity $itName.")
        }else{
          println(s"Only ${itemQuantities(i)} can buy.")
          itemQuantities(i) = 0
        }
      }else{
        sellItem(itName, itQuantity, i + 1)
      }
    }else{
      println(s"Item ${itName} does not exist")
    }
  }
}

object PatternMatching {
  def patMatching(i:Int):Unit = i match{
    case x if(x<=0) => println(s"$i is Negative/Zero")
    case x if(x%2 == 0) => println(s"$i is Even")
    case x if(x%2 != 0) => println(s"$i is Odd")
  }
}

object StringConvertor {
  def toUpper(st:String):Unit = {
    println(st.toUpperCase())
  }
  def toLower(st:String): Unit = {
    println(st.toLowerCase())
  }
  def formatNames(name:String)(formatFun: String => String):String = {
    formatFun(name)
  }

}


object practical04 extends App{
  println("Q1")
  InventoryManagement.displayInventory(0)
  InventoryManagement.reStockItem("Mangusteen",10,0)
  InventoryManagement.sellItem("Apple",10,0)

  println("\nQ2")
  print("Enter a Number:  ")
  val i = scala.io.StdIn.readInt()
  PatternMatching.patMatching(i)

  println("\nQ3")
  StringConvertor.toUpper("Benny")
  println(StringConvertor.formatNames("Niroshan")(n=>n.substring(0,2).toUpperCase + n.substring(2)))
  StringConvertor.toLower("Saman")
  println(StringConvertor.formatNames("Kumara")(n=>n.substring(0,1).toUpperCase + n.substring(1,n.length - 1) + n.substring(n.length - 1).toUpperCase))
}