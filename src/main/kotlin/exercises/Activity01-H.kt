package exercises
fun main() {
    // first input
    println("Do you want to Borrow or return?")
    var response: String = readln().toString()

     // choosing options to return or borrow
    if (response == "borrow")
        borrowBook(input = String())
    if (response == "return")
        returnBook(input = String())





}





fun borrowBook(input:String) {

    println("what book you want to borrow?")


    var bookList = listOf<String>("Harry Potter","Hunger Games","The Witcher")
    println("available books are $bookList")

    var toBorrow: String = readln().toString()

    if(toBorrow == "Harry Potter")
        println("you borrowed Harry Potter")

    if(toBorrow == "Hunger Games")
        println("you borrowed Hunger Games")

    if(toBorrow == "The Witcher")
        println("you borrowed The Witcher")








}

fun returnBook(input:String){
    println("what book you want to return?")

    var toReturn: String = readln().toString()

    if(toReturn == "Harry Potter")
        println("you returned Harry Potter")

    if(toReturn == "Hunger Games")
        println("you returned Hunger Games")

    if(toReturn == "The Witcher")
        println("you returned The Witcher")





}