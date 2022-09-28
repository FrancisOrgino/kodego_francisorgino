fun main(){
    var buyGroceries = BuyGroceries()
    var status: Boolean = true
    var cupNoodles = arrayListOf<String>()
    var cannedMeat = arrayListOf<String>()

    cupNoodles.add("lucky me beef")
    cupNoodles.add("lucky me chicken")
    cupNoodles.add("lucky me bulalo")

    cannedMeat.add("delimondo")
    cannedMeat.add("argentina")
    cannedMeat.add("highlands")


    while (status){

            println("please select from the options")
            println("[1]cup noodles list")
            println("[2]canned meat list")
            println("[3]buy cup noodles")
            println("[4]buy canned meat")
            println("[0]exit")

        var options: Int = readln().toInt()
        if (options == 1) {
            println("these are the list of cup noodles")
            println(cupNoodles)

        }
        else if (options == 2) {
            println("these are the list of canned meat")
            println(cannedMeat)
        }
        else if (options == 3) {
            buyCupnoodles()
        }

        else if (options == 4) {
            buyCannedMeat()
        }
        else if (options == 0) {
            println("thank you")
            status = false
        }

    }

}


class BuyGroceries(){

    init {
        println("welcome to our grocery")
    }


}
fun buyCupnoodles3(){

    var qty: Int = 0
    println("please enter noodles you want to buy")
    var item1: String = readln().toString()

    if(item1 == "lucky me beef"){
        buyluckyMeBeef()

    }
    else if(item1 =="lucky me chicken"){
        buyluckyMeChicken()
    }
    else if(item1 =="lucky me bulalo"){
        buyluckyMeBulalo()
    }

}
fun buyCannedMeat3(){
    var qty2: Int = 0
    println("please enter canned meat you want to buy")
    var item2: String = readln().toString()
    if(item2 == "delimondo"){
        buyDelimondo()
    }
    else if(item2 =="argentina"){
        buyArgentina()
    }
    else if(item2 =="highlands"){
        buyHighlands()
    }

} fun buyluckyMeBeef3() {

    // response on item1 how many of this item
    println("how many lucky me beef")
    var item1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100
    //  response when asking if going to add
    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            amount2 = readln().toInt()
            item1 = item1 + amount2

            // if no it ends the line and total bought is printed and the remaining inventory shows
        } else if (response == "no") {
            println("the total you bought is $item1")
            stock1 = stock1 - item1
            println("current inventory is $stock1")


        }
    } while (response == "yes")
}
fun buyluckyMeChicken3(){

    // response on item1 how many of this item
    println("how many lucky me Chicken?")
    var item1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100

    //  response when asking if going to add
    do {
        println("do you want to add")
        var response: String = readln().toString()

        if (response == "yes") {
            println("how many do you want to add")
            amount2= readln().toInt()
            item1 = item1 + amount2

            // if no it ends the line and total bought is printed and the remaining inventory shows
        }
        else if(response == "no"){
            println("the total you bought is $item1 ")
            var stock1: Int = 100
            stock1 = stock1 - item1
            println("current inventory is $stock1")

        }
    } while (response == "yes")

}fun buyluckyMeBulalo3() {
    // response on item1 how many of this item
    println("how many lucky me bulalo")
    var item1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100

    //  response when asking if going to add
    do {
        println("do you want to add")
        var response: String = readln().toString()

        if (response == "yes") {
            println("how many do you want to add")
            amount2= readln().toInt()
            item1 = item1 + amount2

            // if no it ends the line and total bought is printed and the remaining inventory shows

        } else if (response == "no") {
            println("the total you bought is $item1 ")
            var stock1: Int = 100
            stock1 = stock1 - item1
            println("current inventory is $stock1")
        }
    } while (response == "yes")

} fun buyDelimondo3() {

    // response on item1 how many of this item
    println("how many delimondo?")
    var item1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100
    //  response when asking if going to add
    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            amount2 = readln().toInt()
            item1 = item1 + amount2

            // if no it ends the line and total bought is printed and the remaining inventory shows
        } else if (response == "no") {
            println("the total you bought is $item1")
            stock1 = stock1 - item1
            println("current inventory is $stock1")


        }
    } while (response == "yes")
}
fun buyArgentina3(){

    // response on item1 how many of this item
    println("how many argentina")
    var item1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100

    //  response when asking if going to add
    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            amount2= readln().toInt()
            item1 = item1 + amount2

            // if no it ends the line and total bought is printed and the remaining inventory shows
        }
        else if(response == "no"){
            println("the total you bought is $item1 ")
            var stock1: Int = 100
            stock1 = stock1 - item1
            println("current inventory is $stock1")


        }
    } while (response == "yes")

}fun buyHighlands3() {
    // response on item1 how many of this item
    println("how many lucky me highlands")
    var item1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100

    //  response when asking if going to add
    do {
        println("do you want to add")
        var response: String = readln().toString()


        if (response == "yes") {
            println("how many do you want to add")
            amount2= readln().toInt()
            item1 = item1 + amount2

            // if no it ends the line and total bought is printed and the remaining inventory shows

        } else if (response == "no") {
            println("the total you bought is $item1 ")
            var stock1: Int = 100
            stock1 = stock1 - item1
            println("current inventory is $stock1")
        }
    } while (response == "yes")

}