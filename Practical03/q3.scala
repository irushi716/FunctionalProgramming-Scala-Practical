object q3{
    def avarage(num1:Int,num2:Int):Float = {
        // val mean = (num1+num2)/2.0
        // (mean-(mean%0.01)).toFloat

        val mean = (num1 + num2) / 2.0
        BigDecimal(mean).setScale(3, BigDecimal.RoundingMode.HALF_UP).toFloat
    }
}