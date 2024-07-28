object q1{
    val k = 2
    val i = 2
    val j = 2
    val m = 5
    val n = 5
    val f = 12.0f
    val g = 4.0f
    val c = "X"

    println(s"k + 12 * m = ${k + 12 * m}")
    println(s"m / j = ${m / j}")
    println(s"n % j = ${n % j}")
    println(s"m / j * j = ${m / j * j}")
    println(s"f + 10*5 +g = ${f + 10*5 +g}")
    println(s"++i * n = ${(i+1) * n}")

}

object q2{
    var a:Int = 2
    var b:Int = 3
    var c:Int = 4
    var d:Int = 5

    var k:Float = 4.3f
    var g:Float = 4.0f;

    b = b-1
    println(b*a + c*d)
    d = d-1
    println(a)
    a = a+1

    println(-2*(g-k)+c)
    println(c)
    c=c+1
    
    println (c*a)
    c=c*a
    a=a+1
    
}

object q3{
    def calWage(h:Int):Double = {
        h*250
    }   

    def calOT(hOt:Int):Double = {
        hOt*85
    }

    def calIncome(h:Int,hOt:Int):Double = {
        calWage(h)+calOT(hOt)
    }

    def calTax(h:Int,hOt:Int):Double = {
        calIncome(h,hOt)*0.12
    }

    def calTakeHome(h:Int,hOt:Int):Double = {
        calIncome(h,hOt)-calTax(h,hOt)
    }



}

object q4{
    def calAttendees(tp: Int):Int = {
        120 + (15-tp)/5*20
    }

    def calRevenue(tp:Int):Double = {
        calAttendees(tp)*tp
    }

    def calCost(tp:Int): Double = {
        500 + 3*calAttendees(tp)
    }

    def calProfit(tp:Int): Double = {
        calRevenue(tp) - calCost(tp)
    }

    
}


@main def main():Unit = {
    
    println("Q1:")
    q1;
    println();

    println("Q2:")
    q2;
    println();

    println("Q3:")
    // A typical employee works 40 (normal) and 30(OT) hours per week 
    var takeHomeSalary:Double = q3.calTakeHome(40,30)
    println(takeHomeSalary)
    println();

    println("Q4:")
    // The best ticket price.
    var ticketPrice15 = q4.calProfit(15)
    var ticketPrice20 = q4.calProfit(20)
    var ticketPrice25 = q4.calProfit(25)
    var ticketPrice10 = q4.calProfit(10)

    println(s"TP : Rs.10 : $ticketPrice10\nTP : Rs.15 : $ticketPrice15\nTP : Rs.20 : $ticketPrice20\nTP : Rs.25 : $ticketPrice25")
}