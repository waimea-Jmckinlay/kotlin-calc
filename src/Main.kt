fun main() {

    println("---------------------------------------")
    println(" kotlin calculator")
    println("---------------------------------------")

    val firstnumber = getInt ("Enter your first number")

   val operator = getOperator ( "Enter operator(+ - * / ^ !)")

    val secondnumber = getInt ("Enter your second number")


    while (true){

        if (operator == '+'){ println("$firstnumber + $secondnumber = $answer") break}

       if (operator == '-'){println ("$firstnumber - $secondnumber = $answer") break}

        if (operator == '*'){println ("$firstnumber * $secondnumber = $answer") break}

        if (operator == '/'){println ("$firstnumber - $secondnumber = $answer") break}




    }







}
// filtering so numbers only
//----------------------------------------------------------------------------------------------------------------
fun getString(prompt: String): String {
    var userinput: String
    while (true) {
        print(prompt)

        userinput = readln()
        if (userinput.isNotBlank()) break
    }
    return userinput
}

/**
 * function to get an int from the user
 */
fun getInt(prompt: String): Int {
    var intValue: Int?
    while (true) {
        val userinput: String = getString(prompt)
        intValue = userinput.toIntOrNull()
        if (intValue != null) break
    }
    return intValue!!
}

// filtering so they can only use the operators in the prompt
//------------------------------------------------------------------------------------------------------

fun getOperator (prompt: String): Char {
    var op: Char
    while (true) {
        op = getString(prompt).first()

        if ("+-*/^!".contains(op)) break

    }
    return op
}


