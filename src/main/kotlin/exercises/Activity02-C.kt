fun main() {
        var cupNoodles = arrayListOf<String>()

        cupNoodles.add("lucky me beef")
        cupNoodles.add("lucky me chicken")
        cupNoodles.add("lucky me bulalo")

        var cannedMeat = arrayListOf<String>()

        cannedMeat.add("delimondo")
        cannedMeat.add("argentina")
        cannedMeat.add("highlands")

        do {
                println("please select from the options")
                println("[1]cup noodles list")
                println("[2]canned meat list")
                println("[3]buy cup noodles")
                println("[4]buy canned meat")
                println("[0]exit")

                var response: Int = readln().toInt()

                if (response == 1) {
                        println("these are the list of cup noodles")
                        println(cupNoodles)
                }
                else if (response == 2) {
                        println("these are the list of canned meat")
                        println(cannedMeat)
                }
                else if (response == 3) {
                        buyCupnoodles()
                }

                else if (response == 4) {
                        buyCannedMeat()
                }
                else if (response == 0) {
                     println("thank you")
                }

        } while (response > 0)

}

fun buyCupnoodles(){

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
fun buyCannedMeat(){
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

} fun buyluckyMeBeef() {

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
fun buyluckyMeChicken(){

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

}fun buyluckyMeBulalo() {
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

} fun buyDelimondo() {

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
fun buyArgentina(){

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

}fun buyHighlands() {
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