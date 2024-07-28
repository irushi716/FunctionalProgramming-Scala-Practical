object p3q1{
    def rev(x:String): String = {
        var n=1
        if(x.isEmpty()){
            ""
        }else{
            rev(x.tail) + x.head
        }
    }
}

object p3q2{
    def newList(list: List[String], n: Int = 0): List[String] = {
        if (n >= list.length) 
            Nil 
        else if (list(n).length >= 5) 
            list(n) :: newList(list, n + 1) 
        else newList(list, n + 1) 
    }
}

object p3q3{
    def avarage(num1:Int,num2:Int):Float = {
        // val mean = (num1+num2)/2.0
        // (mean-(mean%0.01)).toFloat

        val mean = (num1 + num2) / 2.0
        BigDecimal(mean).setScale(3, BigDecimal.RoundingMode.HALF_UP).toFloat
    }
}

object p3q4{
    def evenList(list:List[Int],n:Int=0):List[Int]={
        if(n>=list.length){
            Nil
        } else if (list(n)%2 == 0){
            list(n)::evenList(list,n+1)
        } else {
            evenList(list, n + 1)
        }
    }
    def evenSum(list:List[Int],n:Int=0):Int ={
        if(n>=list.length){
            0
        } else {
            list(n)+evenSum(list,n+1)
        }
    }
}

object practical03 extends App{
    println("Q1.")
    printf(p3q1.rev("Hellooo"))

    println("\nQ2.")
    val input = List("Scala", "is", "fun", "but", "challenging", "sometimes")
    val result1 = p3q2.newList(input)
    println(result1)

    println("\nQ3.")
    println(p3q3.avarage(5,8))

    println("\nQ4.")
    val list = List(2,3,4,5,6,7,8,9)
    val result2 = p3q4.evenSum(p3q4.evenList(list))
    println(result2)
}