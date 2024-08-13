import scala.io.StdIn
object practical08 extends App{

    println("Q1")
    println("Enter text:")
    val text = StdIn.readLine()

    val shift = 1
    val encryptedText = p8q1.ciper(p8q1.encrypt, text, shift)
    println(s"Encrypted: $encryptedText") 

    val decryptedText = p8q1.ciper(p8q1.decrypt, encryptedText, shift)
    println(s"Decrypted: $decryptedText")


    println("/nQ2")
    println("Enter a (Int)number: ")
    val number = StdIn.readInt()
    println(p8q2.checkMultiple(number))
   
}

object p8q1{
        val encrypt = (text:String, shift:Int) => text.map(
            char => if(char.isLetter){
                val shifted = char + shift
                if(char.isUpper){
                    if(shifted>'Z') (shifted - 26).toChar else shifted.toChar
                }else{
                    if(shifted > 'z') (shifted - 26).toChar else shifted.toChar
                }
            } else char
        )

        val decrypt = (text:String, shift:Int) => text.map(
            char => if(char.isLetter){
                val shifted = char - shift
                if(char.isUpper){
                    if(shifted<'A') (shifted + 26).toChar else shifted.toChar
                }else{
                    if(shifted < 'a') (shifted + 26).toChar else shifted.toChar
                }
            } else char
        )


        def ciper(algo: (String,Int)=>String, text:String, shift:Int): String = {
                algo(text,shift)
        }
}

object p8q2{
    val isMultiple : (Int,Int) => Boolean = (x,multipleOf) => x%multipleOf == 0 

    val checkMultiple: Int => String = input => {
        (isMultiple(input,3), isMultiple(input,5)) match {
            case (true, true)  => "Multiple of Both Three and Five"
            case (true, false) => "Multiple of Three"
            case (false, true) => "Multiple of Five"
            case (false, false) => "Not a Multiple of Three or Five"
        }
    }

}
