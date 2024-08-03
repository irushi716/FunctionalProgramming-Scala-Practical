import scala.io.StdIn

object Inventry{

    def retrieveAllProductNames(inventory: Map[Int, (String, Int, Double)]):Unit = {
        
        val productNames = inventory.values.map(_._1)
        productNames.foreach(println)
    }

    def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
        inventory.values.map{
        case (_, quantity, price) => quantity * price
        }.sum
    }

    def isEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
        inventory.isEmpty
    }

    def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
        val merged = inventory1.map { case (id, (name, quantity, price)) =>
            inventory2.get(id) match {
                case Some((_, qty2, price2)) =>
                    id -> (name, quantity + qty2, price2)
                case None =>
                    id -> (name, quantity, price)
            }
        }

        // Add products from inventory2 that are not in inventory1
        val finalMerged = merged ++ inventory2.filterNot { 
        case (id, _) => inventory1.contains(id) 
        }
        finalMerged
    }

    def printProductDetails(inventory: Map[Int, (String, Int, Double)], id: Int): Unit = {
        inventory.get(id) match {
        case Some((name, quantity, price)) =>
            println(s"Product ID $id: Name=$name, Quantity=$quantity, Price=$price")
        case None =>
            println(s"Product ID $id does not exist in the inventory.")
        }
    }

}

object StudentRecordManager { 

    def getStudentInfo(): (String, Int, Int, Double, Char) = {
        
        print("Enter student name: ")
        val name = StdIn.readLine()
        
        print("Enter student marks: ")
        val marks = readInt()
        
        print("Enter the total possible mark: ")
        val totalMarks = readInt()
        
        val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

        if (isValid) {
            val percentage = calculatePercentage(marks, totalMarks)
            val grade = assignGrade(percentage)
            (name, marks, totalMarks, percentage, grade)
        } else {
            throw new IllegalArgumentException(errorMessage.getOrElse("Invalid input"))
        }
    }

    def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
        val (name, marks, totalMarks, percentage, grade) = record
        
        println(s"Student Name: $name")
        println(s"Marks Obtained: $marks")
        println(s"Total Marks: $totalMarks")
        println(f"Percentage: $percentage%.2f%%")
        println(s"Grade: $grade")
    }

    def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
        if (name.isEmpty) {
        (false, Some("Name cannot be empty"))
        } 
        else if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
        (false, Some("Marks must be positive integers and less than or equal to total marks"))
        } 
        else {
        (true, None)
        }
    }

    def calculatePercentage(marks: Int, totalMarks: Int): Double = {
        
        (marks.toDouble / totalMarks) * 100
    }

    def assignGrade(percentage: Double): Char = {
        percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _            => 'D'
        }
    }

    def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
        var isValid = false
        var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')
        
        while (!isValid) {
        try {
            studentInfo = getStudentInfo()
            isValid = true
        } catch {
            case e: IllegalArgumentException =>
            println(e.getMessage)
            println("Please enter the information again.")
        }
        }
        studentInfo
    }
    
    def readInt(): Int = {
        var valid = false
        var value = 0
        while (!valid) {
        try {
            value = StdIn.readInt()
            valid = true
        } catch {
            case _: NumberFormatException =>
            println("Invalid input. Please enter an integer.")
            
            StdIn.readLine()
        }
        }
        value
    }
}


object practical06 extends App{

    println("Q1")
    val Inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 50, 20.0),
      102 -> ("ProductB", 30, 30.0),
      103 -> ("ProductC", 20, 25.0)
    )
    val Inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 40, 35.0),
      104 -> ("ProductD", 10, 15.0)
    )

    println("Product names in inventory1:")
    Inventry.retrieveAllProductNames(Inventory1)

    println("Total value of all products in inventory1: " + Inventry.calculateTotalValue(Inventory1))

    println("Is inventory1 empty? " + Inventry.isEmpty(Inventory1))

    val mergedInventory = Inventry.mergeInventories(Inventory1, Inventory2)

    println("Merged Inventory:")
    mergedInventory.foreach { case (id, (name, quantity, price)) =>
      println(s"ID: $id, Name: $name, Quantity: $quantity, Price: $price")
    }

    Inventry.printProductDetails(Inventory1, 102)



    
    println("Q2")
    val studentInfo = StudentRecordManager.getStudentInfoWithRetry()
    StudentRecordManager.printStudentRecord(studentInfo)
  
}