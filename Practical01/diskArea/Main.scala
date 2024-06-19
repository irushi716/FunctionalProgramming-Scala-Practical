import scala.math.Pi

def areaOfDisk(radius:Double):Double = {
    Pi*radius*radius
}


object Main extends App{
  val radius = 5.0
  val area = areaOfDisk(radius)
  println(s"The area of a disk with $radius is $area")
}