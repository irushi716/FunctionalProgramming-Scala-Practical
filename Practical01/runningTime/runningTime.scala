object runningTime{
    def calEasyPace(distance:Integer):Double = {
        8*distance
    }
    def calTempoPace(distance:Integer):Double = {
        7*distance
    }

    def main(args: Array[String]): Unit = {
        var distance1 = 2
        var distance2 = 3
        var distance3 = 2
        
        var tRunTime = calEasyPace(distance1)+calTempoPace(distance2)+calEasyPace(distance3)

        println(s"Total running time is $tRunTime")
    }
}