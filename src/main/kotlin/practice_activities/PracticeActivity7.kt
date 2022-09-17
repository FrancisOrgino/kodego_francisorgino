fun main(){

    println("please enter the width")
    var width: Double = readln().toDouble()


    println("please enter the length")
    var length: Double = readln().toDouble()

    println("your width is $width")
    println("your length is $length")
    println("do you want to print area and perimeter?")
    var response: String = readln().toString()




    var multiplier: Int = 2
     var area = width * length
     var perimeter =  (length + width) * multiplier

if(response =="yes") {


    println("the rectangle area is $area")
    println("the rectangle perimeter is $perimeter")
}

}



