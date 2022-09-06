fun main (){

    // included variables


    println("Enter Amount you want to Deposit")
    var amount1 : Int = readln().toInt()

    println("You deposited $amount1  ")


    do {
        println("do you want to continue?")
        var yesNo: String = readln().toString()
        if (yesNo == "yes")
            println("please add another amount")
        else if(yesNo == "no")
            println("do you want to add another amount?")
        var amount2 : Int = readln().toInt()
        amount1++
    }while(amount1 > 0 )

}