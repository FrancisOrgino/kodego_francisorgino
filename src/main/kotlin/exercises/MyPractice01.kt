fun main() {
    var buyitem = BuyItem()
    var status: Boolean = true
    var cupNoodles = arrayListOf<String>()
    var cannedMeat = arrayListOf<String>()

    cupNoodles.add("lucky me beef")
    cupNoodles.add("lucky me chicken")
    cupNoodles.add("lucky me bulalo")

    cannedMeat.add("delimondo")
    cannedMeat.add("argentina")
    cannedMeat.add("highlands")

    while (status) {

        println("please select from the options")
        println("[1]cup noodles list")
        println("[2]canned meat list")
        println("[3]buy cup noodles")
        println("[4]buy canned meat")
        println("[5]accept deliveries")
        println("[6]check inventory")
        println("[0]exit")


        var options: Int = readln().toInt()
        if (options == 1) {
            println("these are the list of cup noodles")
            println(cupNoodles)

        } else if (options == 2) {
            println("these are the list of canned meat")
            println(cannedMeat)
        } else if (options == 3) {
            buyitem.buyCupNoodlesList()
        } else if (options == 4) {
            buyitem.buyCannedMeatList()
        } else if (options == 5) {
            buyitem.acceptNewDelivery()
        } else if (options == 6) {
            buyitem.inventoryChecker()
        } else if (options == 0) {
            println("thank you")
            status = false
        }
    }
}

    class BuyItem() {
        var initialStock1: Int = 100 // for lucky me beef
        var initialStock2: Int = 100 // for lucky me chicken
        var initialStock3: Int = 100 // for lucky me bulalo
        var initialStock4: Int = 100 // for delimondo
        var initialStock5: Int = 100 // for argentina
        var initialStock6: Int = 100 // for highlands


        var totalSold1 = arrayListOf<Int>()
        var totalSold2 = arrayListOf<Int>()
        var totalSold3 = arrayListOf<Int>()
        var totalSold4 = arrayListOf<Int>()
        var totalSold5 = arrayListOf<Int>()
        var totalSold6 = arrayListOf<Int>()

        var delivery1 = arrayListOf<Int>()
        var delivery2 = arrayListOf<Int>()
        var delivery3 = arrayListOf<Int>()
        var delivery4 = arrayListOf<Int>()
        var delivery5 = arrayListOf<Int>()
        var delivery6 = arrayListOf<Int>()

        var luckyMeBeefSold = totalSold1.sum()
        var luckyMeChickenSold = totalSold2.sum()
        var luckyMeBulaloSold = totalSold3.sum()
        var delimondoSold = totalSold4.sum()
        var argentinaSold = totalSold5.sum()
        var highlandsSOld = totalSold6.sum()

        var luckyMeBeefDelivery = delivery1.sum()
        var luckyMeChickenDelivery = delivery2.sum()
        var luckyMeBulaloDelivery = delivery3.sum()
        var delimondoDelivery = delivery4.sum()
        var argentinaDelivery = delivery5.sum()
        var highlandsDelivery = delivery6.sum()
        init {
            println("welcome to your groceries")
        }

        fun buyCupNoodlesList() {

            println("please enter noodles you want to buy")
            var item1: String = readln().toString()

            if (item1 == "lucky me beef") {
                buyLuckyMeBeefNoodles()
            } else if (item1 == "lucky me chicken") {
                buyLuckyMeChickenNoodles()
            } else if (item1 == "lucky me bulalo") {
                buyLuckyMeBulaloNoodles()
            }
        }
        fun buyCannedMeatList() {

            println("please enter canned meat you want to buy")
            var item2: String = readln().toString()
            if (item2 == "delimondo") {
                  buyDelimondoCornedBeef()
            } else if (item2 == "argentina") {
                 buyArgentinaCornedBeef()
            } else if (item2 == "highlands") {
                  buyHigLandsCornedBeef()
            }
        }

        fun buyLuckyMeBeefNoodles() {
            // response on item1 how many of this item
            println("how many lucky me beef")
            var sales1: Int = readln().toInt()
            var amount1: Int = 0
            totalSold1.add(sales1)
            luckyMeBeefSold = totalSold1.sum()

        }

        fun buyLuckyMeChickenNoodles() {
            // response on item1 how many of this item
            println("how many lucky me chicken")
            var sales2: Int = readln().toInt()
            var amount2: Int = 0
            totalSold2.add(sales2)
            luckyMeChickenSold = totalSold2.sum()

        }

        fun buyLuckyMeBulaloNoodles() {
            // response on item1 how many of this item
            println("how many lucky me bulalo")
            var sales3: Int = readln().toInt()
            var amount3: Int = 0
            totalSold3.add(sales3)
            luckyMeBulaloSold = totalSold3.sum()
        }

        fun buyDelimondoCornedBeef() {
            // response on item1 how many of this item
            println("how many delimondo")
            var sales4: Int = readln().toInt()
            var amount4: Int = 0
            totalSold4.add(sales4)
            delimondoSold = totalSold4.sum()
        }

        fun buyArgentinaCornedBeef() {
            // response on item1 how many of this item
            println("how many lucky me argentina")
            var sales5: Int = readln().toInt()
            var amount5: Int = 0
            totalSold5.add(sales5)
            argentinaSold = totalSold5.sum()
        }

        fun buyHigLandsCornedBeef() {
            // response on item1 how many of this item
            println("how many lucky highlands")
            var sales6: Int = readln().toInt()
            var amount6: Int = 0
            totalSold6.add(sales6)
            highlandsSOld = totalSold6.sum()
        }

        fun acceptNewDelivery() {
            println("please enter items you will recieve")
            var toRecieve: String = readln()
            if (toRecieve == "lucky me beef") {
                acceptLuckyMeBeefNoodles()
            } else if (toRecieve == "lucky me chicken") {
                acceptLuckyMeChickenNoodles()
            } else if ( toRecieve == "lucky me bulalo"){
                acceptLuckyMeBulaloNoodles()
            } else if (toRecieve == "delimondo"){
                acceptDelimondoCornedBeef()
            } else if (toRecieve == "argentina"){
                acceptArgentinaCornedBeef()
            } else if (toRecieve == "highlands"){
                acceptHighLandsCornedBeef()
            }
}

        fun acceptLuckyMeBeefNoodles() {
            println("how many lucky me beef to receive")
            var itemToReceive1: Int = readln().toInt()
            delivery1.add(itemToReceive1)
            luckyMeBeefDelivery = delivery1.sum()

        }

        fun acceptLuckyMeChickenNoodles() {
            println("how many lucky me chicken to receive")
            var itemToReceive2: Int = readln().toInt()
            delivery2.add(itemToReceive2)
            luckyMeChickenDelivery = delivery2.sum()

        }

        fun acceptLuckyMeBulaloNoodles() {
            println("how many lucky me bulalo to receive")
            var itemToReceive3: Int = readln().toInt()
            delivery3.add(itemToReceive3)
            luckyMeBulaloDelivery = delivery3.sum()

        }

        fun acceptDelimondoCornedBeef() {
            println("how many delimondo to receive")
            var itemToReceive4: Int = readln().toInt()
            delivery4.add(itemToReceive4)
            delimondoDelivery = delivery4.sum()
        }

        fun acceptArgentinaCornedBeef() {
            println("how many argentina to receive")
            var itemToReceive5: Int = readln().toInt()
            delivery5.add(itemToReceive5)
            argentinaDelivery = delivery5.sum()
        }

        fun acceptHighLandsCornedBeef() {
            println("how many highlands to receive")
            var itemToReceive6: Int = readln().toInt()
            delivery6.add(itemToReceive6)
            highlandsDelivery = delivery6.sum()
        }

        fun inventoryChecker(){
            var currentLuckyMeBeefStock = initialStock1 + luckyMeBeefDelivery - luckyMeBeefSold
            var currentLuckyMeChickenStock = initialStock2 + luckyMeChickenDelivery - luckyMeChickenSold
            var currentLuckyMeBulaloStock = initialStock3 + luckyMeBulaloDelivery - luckyMeBulaloSold
            var currentDelimondoStock = initialStock4 + delimondoDelivery - delimondoSold
            var currentArgentinaStock = initialStock5 + argentinaDelivery - argentinaSold
            var currentHighlandsStock = initialStock6 + highlandsDelivery - highlandsSOld

            println("lucky me beef: $currentLuckyMeBeefStock")
            println("lucky me chicken: $currentLuckyMeChickenStock")
            println("lucky me bulalo: $currentLuckyMeBulaloStock")
            println("delimondo: $currentDelimondoStock")
            println("argentina: $currentArgentinaStock")
            println("highlands: $currentHighlandsStock")
        }
    }



