object q1{
    def rev(x:String): String = {
        var n=1
        if(x.isEmpty()){
            ""
        }else{
            rev(x.tail) + x.head
        }
    }
}