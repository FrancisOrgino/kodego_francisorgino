package exercises

fun main () {

    var booklist = ArrayList<String>()
    var status = ArrayList<String>()
    var dateBorrowed = ArrayList<String>()
    var dateReturn = ArrayList<String>()

    booklist.add("Harry Potter")
    booklist.add("Games of Thrones")
    booklist.add("Avengers")

    status.add("Available")
    status.add("Not Available")

    do {


        println()
        println("Options")
        println("[1} List of Book")
        println("[2} Borrow")
        println("[3} Return")
        println("[4} Add books to library")
        println("[5} Exit")

        println("please enter code")

        var response: Int = readln().toInt()




        if (response == 1) {
            println("available books are")
            println(booklist)
        }



        if (response == 2) {
            println("enter the book you want to borrow")
            var bookTitleBorrow = readln().toString()
            booklist.remove(bookTitleBorrow)
            println("you borrowed $bookTitleBorrow")

        }


        if (response == 3) {
            println("enter the book you want to return")
            var bookTitleReturn = readln().toString()
            booklist.add(bookTitleReturn)
            println("Thank you for returning $bookTitleReturn")
        }


        if (response == 4) {
            println("enter the book you want to add in the library")
            var bookTitleAdd = readln().toString()
            booklist.add(bookTitleAdd)
            println("$bookTitleAdd is added in the library")

        }

        if (response == 5)
            println("thank you")
            break

    } while (response > 0)

}













