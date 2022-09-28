fun main(){
    var currentLoad = arrayListOf<Int>(100)
    var currentBattery = arrayListOf<Int>(20)
    var callMinutes = arrayListOf<Int>()
    var sendMessage: Int = 1
    var loadAdder = currentLoad.sum()
    var batteryAdder = currentBattery.sum()


   do {
       println("    options     ")
       println("[1] buy load")
       println("[2] send message")
       println("[3] call")
       println("[4] charge")
       println("[5] check balance")
       println("[0] exit")
       println("please choose from the options")



       var options: Int = readln().toInt()

       if (options == 1) {
           println("how much load you want to buy?")
           var buyLoad: Int = readln().toInt()
           currentLoad.add (buyLoad)
           loadAdder = currentLoad.sum()
           println("thank you for loading your current balance is now $loadAdder")


       } else if (options == 2) {
           println("please enter your text")
           var txtAmount: Int = 1
           var message: String = readln().toString()
           var messageCharge = Int
           currentLoad.minus(txtAmount)
           println("$message sent!")


       } else if (options == 3) {
           println("how many minutes you want to call")
           var callMinutes: Int = readln().toInt()
           var callCalculator = callMinutes * 8
           currentLoad.minus(callCalculator)

           //println("your total call charge is $callCalculator")




       } else if (options == 4) {
           println("how many minutes you want to charge?")
           var chargeTime: Int = readln().toInt()
           var chargeCalculator = chargeTime * 3
           currentBattery.add(chargeCalculator)
           batteryAdder = currentBattery.sum()
           if(batteryAdder <= 99) {
               println("your current battery is now $batteryAdder %")
           }
           else if (batteryAdder >=100 ) {
               println("your battery is 100% please unplug")
           }


       } else if (options == 5)
            println("your current battery is $batteryAdder %")
            println("thank you")

   }while (options > 0)
}