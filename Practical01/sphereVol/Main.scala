import scala.math.Pi

def sphereVolume(radius: Double):Double ={
    (4.0/3)*Pi*radius*radius*radius
}

object Main extends App{
    var radius = 5
    var volume = sphereVolume(radius)
    println(s"Volume of a sphere with a radius $radius is $volume .")
}