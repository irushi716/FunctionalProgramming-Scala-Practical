import q4.evenList
object main extends App{
    println("Q1.")
    printf(q1.rev("Hellooo"))

    println("\nQ2.")
    val input = List("Scala", "is", "fun", "but", "challenging", "sometimes")
    val result1 = q2.newList(input)
    println(result1)

    println("\nQ3.")
    println(q3.avarage(5,8))

    println("\nQ4.")
    val list = List(2,3,4,5,6,7,8,9)
    val result2 = q4.evenSum(evenList(list))
    println(result2)
}