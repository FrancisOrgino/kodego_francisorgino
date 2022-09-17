fun main(){

}
class Empty {

    class Outer

    val name = "Outer"

    class Nested{

        val name = "Nested"
        fun show() = "The name: $name"

    }

    class Outer2

    val name1 = "Outer2"
    fun show() = "The name is $name1"

    inner class Inner {
    val name2 = "Inner"
        fun show() = "the data: $name2 and $name1"


    }



}