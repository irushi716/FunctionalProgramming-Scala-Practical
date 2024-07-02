object q2{
    def newList(list: List[String], n: Int = 0): List[String] = {
        if (n >= list.length) 
            Nil 
        else if (list(n).length >= 5) 
            list(n) :: newList(list, n + 1) 
        else newList(list, n + 1) 
    }
}
