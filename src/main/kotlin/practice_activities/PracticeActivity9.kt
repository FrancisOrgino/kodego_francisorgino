fun main(){
   // var realme8 = MobilePhone("realme","andriod",2019,4000,5000)
  //  realme8.brand = "realme10"
   // realme8.batteryCap = 5000
   // realme8.price = 6000
    //var vivo = MobilePhone("vivo")
    var oppo = MobilePhone("iphone")




}

class MobilePhone(var brand: String,var Os: String,var year:Int, var batteryCap: Int, var price: Int ){

    init{
    println("my mobile phone brand is $brand")
    println("my mobile phone os is $Os")
    println("my mobile phone year created is $year")
    println("my mobile phone battery capacity is $batteryCap Mah")
    println("my mobile phone price is $price")

}
    constructor(brand: String):this(brand,"android",2018,100,500){}
    constructor(price: Int):this("realme8","android",2018,100,price){}

    fun batteryUsage(){
        println("my current battery is $batteryCap")
    }

    fun batteryDown(){

        batteryCap--



    }




}