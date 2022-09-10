fun main(){

palindromeChecker("String")
}
fun palindromeChecker(word:String) {

    println("please type your word")
    var word: String = readln().toString()
    println("your word is $word please retype to check if palindrome")

    var word2: String = readln().toString()
    var reverse = word.reversed()

    if (word2 == word) {
        println("your word $word2 is a palindrome")
    } else if (word2 == reverse) {
        println("your word $word is not a palindrome")
    }
}