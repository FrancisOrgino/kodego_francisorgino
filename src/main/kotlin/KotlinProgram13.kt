fun main(){

    var names = arrayOf("john", "paul", "mark")
    println(names[1])


  var numbers = arrayOf<Int>(2,3,4,5,6,7,8,9,10)
    println(numbers[5])

    println(numbers.size)
    println("@@@@@@@@@@")
    println(names[0])
    println(names[1])
    println(names[2])
    names.set(1, "Matthew")
    println("@@@@@@@@@")
    println(names.get(0))
    println(names.get(1))
    println(names.get(2))
}