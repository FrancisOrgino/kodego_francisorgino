fun main () {

    println("how much is the item")
    var price: Int = readln().toInt()

    var price1: Int = 100
    var price2: Int = 5
    var price3: Int = 10
    var price4: Int = 15
    var price5: Int = 20


    if ((price >= 0) && (price <= 10000)) {
        println("No discount")
    } else if ((price >= 10001) && (price <= 20000)) {
        var discount = price / price1 * price2
        var discount1 = price - discount
        println("your discount is $discount you will only pay $discount1")

    } else if ((price >= 20001) && (price <= 50000)) {
        var discount = price / price1 * price3
        var discount1 = price - discount
        println("your discount is $discount you will only pay $discount1")

    } else if ((price >= 50001) && (price <= 100000)) {
        var discount = price / price1 * price4
        var discount1 = price - discount
        println("your discount is $discount you will only pay $discount1")

    } else if ((price >= 100001)){
        var discount = price / price1 * price5
        var discount1 = price - discount
        println("your discount is $discount you will only pay $discount1")



    }



}