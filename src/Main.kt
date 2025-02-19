fun main() {

    println("---------------------------------------")
    println(" kotlin calculator")
    println("---------------------------------------")

    val firstnumber = getnumber ("Enter your first number")

   val operator = getoperator ( "Enter operator(+ - * / ^ !)")

    val secondnumber = getnumber ("Enter your second number")







}


// filtering so numbers only

fun getnumber (prompt: String, ): Int {
    var userinput: Int?
    while (true) {
        print(prompt)
         userinput: = readln
        if (userinput == null()) break

    }

    return userinput !!

}

fun getoperator (prompt: String) {


}