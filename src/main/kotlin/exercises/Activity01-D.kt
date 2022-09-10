fun main () {

    // first function entering amount


    println("Enter Amount you want to Deposit")
    var amount1: Double = readln().toDouble()


    // loop for yes no and quit to amount2


    do {
        println("do you want to continue?")
        var response: String = readln().toString()


        if (response == "yes") {
            println("please add another amount")
            var amount2: Double = readln().toDouble()
            amount1 = amount1 + amount2

            // if no a set input is ask " do you want to add another amount"
        }
        else if(response == "no"){
            println("do you want to add another amount?")
            response = readln()

            // if quit total amount is showed and divisor is asked
        }
        if(response =="quit"){
            println("your total amount is $amount1 divide by how many?")
        }
    } while (response == "yes")

    // when divided total amount is will print

    var divisor: Int = readln().toInt()
    println("your denominations are ${amount1/divisor}")







}