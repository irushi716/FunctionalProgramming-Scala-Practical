// object main extends App{
//     q1;
//     q2;
// }

@main def main():Unit = {
    q1;
    q2;

    // A typical employee works 40 (normal) and 30(OT) hours per week 
    var takeHomeSalary:Double = q3.calTakeHome(40,30)
    println(takeHomeSalary)
    
    // The best ticket price.
    var ticketPrice15 = q4.calProfit(15)
    var ticketPrice20 = q4.calProfit(20)
    var ticketPrice25 = q4.calProfit(25)
    var ticketPrice10 = q4.calProfit(10)

    println(s"TP : Rs.10 : $ticketPrice10\nTP : Rs.15 : $ticketPrice15\nTP : Rs.20 : $ticketPrice20\nTP : Rs.25 : $ticketPrice25")
}