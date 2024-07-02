object q4{
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