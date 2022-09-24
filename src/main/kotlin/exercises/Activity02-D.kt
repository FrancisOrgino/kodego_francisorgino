fun main(){

    var deposit1 = DepositAmount(0)
         println("do you want to deposit?")

    var response: String = readln().toString()

         if(response == "yes") {
             depositor("yes",0)
         }
}
    class DepositAmount(amount1: Int){

        init {
            println("welcome to the depository")
        }

}
    fun depositor(response:String,amount1: Int):Int {
        println("please enter the amount you want to deposit")
        var amount1 = readln().toInt()

    do {
        println("do you want to continue?")

        var response: String = readln().toString()


        if (response == "yes") {
            println("please add another amount")
            var amount2: Int = readln().toInt()
            amount1 = amount1 + amount2


            // if no a set input is ask " do you want to add another amount"
        } else if (response == "no") {
            println("do you want to add another amount?")
            response = readln()


            // if quit total amount is showed and divisor is asked
        }
        if (response == "quit") {
            println("your total amount is $amount1 divide by how many?")

        }
    } while (response == "yes")

    // when divided total amount is will print

    var divisor: Int = readln().toInt()
    println("your denominations are ${amount1 / divisor}")
        return amount1

}








