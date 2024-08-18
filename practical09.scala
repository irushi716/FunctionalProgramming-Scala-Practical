import scala.io.StdIn
import p9q1.interset
import p9q2.pattern

object practical09 extends App{
    
    println("Q1")
    println("Enter the deposited value(as 100.00 for Rs.100/=)")
    val amount = StdIn.readDouble()
    println(p9q1.interset(amount))

    println("\nQ2")
    println("Enter a number:")
    val n = StdIn.readInt()
    println(p9q2.pattern(n))

    println("\nQ3")
    println(p9q3.toUpper("Benny"))
    println(p9q3.formatNames("Niroshan", n=>n.substring(0,2).toUpperCase + n.substring(2)))
    println(p9q3.toLower("Saman"))
    println(p9q3.formatNames("Kumara", n=>n.substring(0,1).toUpperCase + n.substring(1,n.length - 1) + n.substring(n.length - 1).toUpperCase))
}

object p9q1{ 
    val interset: Double => String = {
        case i if (i<=0) => s"Zero interest"
        case i if (i<=20000) => s"Interest for $i : ${i*2/100}" 
        case i if (i<=200000) => s"Interest for $i : ${i*3.5/100}" 
        case i if (i<=2000000) => s"Interest for $i : ${i*4/100}" 
        case i => s"Interest for $i : ${i*6.5/100}" 
    }
}

object p9q2{
    val isEven: Int => Boolean = (x => x%2 == 0)
    val isZero: Int => Boolean = (x => x==0)
    val isNeg: Int => Boolean = (x => x<0)

    val pattern: Int => String = {
        case i if (isZero(i) || isNeg(i)) => s"$i is Negative/Zero" 
        case i if (isEven(i)) => s"$i is Even"
        case i if (!isEven(i)) => s"$i is odd"
    }
}

object p9q3{
    val toUpper = (x:String) => x.toUpperCase()
    val toLower = (x:String) => x.toLowerCase()

    val formatNames : (String, String => String) => String = (name , formatFun) => formatFun(name)
}