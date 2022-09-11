package exercises

fun main (){

    println("what do you want to buy")

    var response: String = readln().toString()

    // choosing options to return or borrow
    if (response == "Lucky me Beef")
        luckyBeef(input = String())
    if (response == "Lucky me Chicken")
        luckyChicken(input = String())
    if (response == "Lucky me Bulalo")
        luckyBulalo(input = String())
    if (response == "inventory")
         inventory(input = String())





}

fun luckyBeef(input:String) {

    println("how many lucky me beef")
    var item1: Int = readln().toInt()

    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            var amount2: Int = readln().toInt()
            item1 = item1 + amount2


        }
        else if(response == "no"){
            println("the total you bought is $item1")
            var stock1: Int = 100
            stock1 = stock1 - item1
            println("current inventory is $stock1")



        }
    } while (response == "yes")





}

fun luckyChicken(input:String){

    println("how many lucky me Chicken?")
    var item2: Int = readln().toInt()

    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            var amount2: Int = readln().toInt()
            item2 = item2 + amount2


        }
        else if(response == "no"){
            println("the total you bought is $item2 ")
            var stock1: Int = 100
            stock1 = stock1 - item2
            println("current inventory is $stock1")


        }
    } while (response == "yes")





}

fun luckyBulalo(input:String) {

    println("how many lucky me bulalo")
    var item3: Int = readln().toInt()

    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            var amount2: Int = readln().toInt()
            item3 = item3 + amount2


        } else if (response == "no") {
            println("the total you bought is $item3 ")
            var stock1: Int = 100
            stock1 = stock1 - item3
            println("current inventory is $stock1")
        }
    } while (response == "yes")

}
    fun inventory(input:String) {



        }









