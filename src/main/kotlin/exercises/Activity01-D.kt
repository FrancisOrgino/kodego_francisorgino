fun main (){

   // included variables
    var yes1 : String = "Yes"

    var cont : String = "another amount?"


   println("Enter Amount you want to Deposit")
    var amount1 : Int = readln().toInt()

    println("You deposited $amount1  ")

   println("do you want to add another amount?")
    var yesNo : String = readln().toString()


    if(yesNo == "yes") { println("please enter amount you want to add")

        var amount2: Int = readln().toInt()

        println("You added $amount2  ")



    }





}