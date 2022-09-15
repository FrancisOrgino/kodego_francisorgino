fun main(){
  var anne = Person("anne")
    anne.age =25
    anne.displayAge()


}

class Person(var name: String, var age: Int){

        init{
            println("Object Created!")
            println("name is $name")
            println("age is $age")

        }

    constructor(name: String):this(name, 21){}
      constructor(age:Int):this("defaultname is",age){}

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