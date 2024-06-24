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