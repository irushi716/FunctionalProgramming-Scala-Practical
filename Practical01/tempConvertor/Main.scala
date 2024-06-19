def tempConvertor(celcius: Integer):Double ={
    celcius*1.8000+32.00
}

object Main extends App{
    var celcius = 35
    var fahrenheit = tempConvertor(celcius)
    println(s"$celcius C is equal to $fahrenheit F")
}