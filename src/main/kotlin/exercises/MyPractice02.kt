fun main () {

    // first function entering amount


    println("Enter Amount you want to Deposit")
    var amount1: Int = readln().toInt()


    // loop for yes and no to amount2



    do {
        println("do you want to continue?")
        var response: String = readln().toString()


        if (response == "yes"){
            println("please add another amount")
         var amount2: Int = readln().toInt()}



        else if(response == "no"){
            println("do you want to add another amount?")
            response = readln()
        }

        else if(response =="quit"){
            println("divide by how many")
            var amount3: Int = readln().toInt()}



    } while (response == "yes")

     println("total amount is")






}