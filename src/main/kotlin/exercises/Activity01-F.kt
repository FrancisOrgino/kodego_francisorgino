fun main(){
    // encoding first input
    println("please type your word")
    var word: String = readln().toString()
    println("your word is $word please retype to check if palindrome")

    // word to reverse

    var word2: String = readln().toString()
    var reverse = word.reversed()


    // palindrome checker
    if(word2 == word) {
        println("your word $word2 is a palindrome")
    }

        else if (word2 == reverse) {
        println("your word $word is not a palindrome")
    }


}