fun main () {

    // first function entering amount


    println("Enter Amount you want to Deposit")
    var amount1: Double = readln().toDouble()


    // loop for yes and no to amount2


    do {
        println("do you want to continue?")
        var response: String = readln().toString()


        if (response == "yes") {
            println("please add another amount")
            var amount2: Double = readln().toDouble()
            amount1 = amount1 + amount2
        }



    } while (response == "yes")

    println("total is $amount1 divide by how many?")
    var divisor: Int = readln().toInt()






}