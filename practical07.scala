object practical07 extends App{

    val MyList1 = List(1,2,3,4,5,6,7,8,9,10)

    println("Q1")
    def filterEvenNumbers(numbers: List[Int]): List[Int] = numbers.filter(number => number % 2 == 0)
    println(filterEvenNumbers(MyList1))

    println("\nQ2")
    val calculateSquare = (numList:List[Int]) => (numList.map(n => n*n))
    println(calculateSquare(MyList1))

    println("\nQ3")
    def isPrime: Int => Boolean = n => {
        if (n <= 1) false
        else if (n == 2) true
        else !(2 to Math.sqrt(n).toInt).exists(i => n%i == 0)
    }

    // def GCD(x: Int, y: Int): Int = y match {
    //     case 0 => x
    //     case a if a > x => GCD(a, x)
    //     case _ => GCD(x, y % x)
    // }

    // def isAPrime(x: Int, y: Int = 2): Boolean = y match {
    //     case a if a == x => true
    //     case a if GCD(x, a) > 1 => false
    //     case _ => isAPrime(x, y + 1)
    // }

    val  filterPrime = (numList:List[Int]) => (numList.filter(n => isPrime(n)))
    val primes = filterPrime(MyList1)
    println(primes)
}