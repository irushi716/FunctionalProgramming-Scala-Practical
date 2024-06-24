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