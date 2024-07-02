error id: file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/Practical03/q4.scala:[271..272) in Input.VirtualFile("file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/Practical03/q4.scala", "object q4{
    def evenList(list:List[Int],n:Int=0):List[Int]={
        if(n>=list.length){
            Nil
        } else if (list(n)%2 == 0){
            list(n)::evenList(list,n+1)
        } else {
            evenList(list, n + 1)
        }
    }
    def 
}")
file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/Practical03/q4.scala
file:///D:/UCSC-CS/Second_Year/Semester1/SCS2204%20Functional%20Programming/Practical/Practical03/q4.scala:12: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace