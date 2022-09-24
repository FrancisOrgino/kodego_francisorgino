fun main() {
        println("please choose from the options")
        println("[1} palindrome checker")
        println("[0} exit")

        var response: Int = readln().toInt()

        if (response == 1) {
            PalindromeChecker()
        }
        else if (response == 0)
            println("thank you")

}

class palindrome(word:String){

    init{
        println("welcome to the palindrome checker")
    }


}fun PalindromeChecker(){
    // encoding first input
    println("please type your word")
    var word: String = readln().toString()
    var reversedWord = word.reversed()

    if (word == reversedWord) {
        println("your word is a palindrome")
    }else {
        println("your word is not a palindrome")

    }
}