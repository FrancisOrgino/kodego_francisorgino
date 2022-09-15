fun main(){
    var joe = Person("joe",21)
    println("**********")
    println("${joe.name}'s current age is ${joe.age}")
    println("after 1 year")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.age}")


}

class Person(var name: String, var age: Int){

        init{
            println("Object Created!")
            println("name is $name")
            println("age is $age")

        }

    fun walk(){
        println("a person walks")


    }
    fun eats() {
        println("a person eats")
    }

    fun displayAge() {
        println(age)
    }

    fun ageUp(){
        age++
    }



}