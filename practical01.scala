import scala.math.Pi

def areaOfDisk(radius:Double):Double = {
    Pi*radius*radius
}

def calEasyPace(distance:Integer):Double = {
    8*distance
}
def calTempoPace(distance:Integer):Double = {
    7*distance
}

def sphereVolume(radius: Double):Double ={
    (4.0/3)*Pi*radius*radius*radius
}

def tempConvertor(celcius: Integer):Double ={
    celcius*1.8000+32.00
}

object practical01 extends App{

    println("sphereVolume")
    var radius1 = 5
    var volume = sphereVolume(radius1)
    println(s"Volume of a sphere with a radius $radius1 is $volume .")
    print("\n")

    println("tempConvertor")
    var celcius = 35
    var fahrenheit = tempConvertor(celcius)
    println(s"$celcius C is equal to $fahrenheit F")
    print("\n")

    println("runningTime")
    var distance1 = 2
    var distance2 = 3
    var distance3 = 2
    var tRunTime = calEasyPace(distance1)+calTempoPace(distance2)+calEasyPace(distance3)
    println(s"Total running time is $tRunTime")
    print("\n")

    println("areaOfDisk")
    val radius2 = 5.0
    val area = areaOfDisk(radius2)
    println(s"The area of a disk with $radius2 is $area")
    print("\n")
}



