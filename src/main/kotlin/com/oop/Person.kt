package com.oop

class `Person.kt` {
    var name: String ="John"
        get(){return field}
        set(value){
            field = value
        }   

    var age: Int = 23
        get(){return field}
        set(value){
            if(value < 1){
                println("invalid age!!")
        }else {
            field = value
        }

}
    init{
    println("object created")
        println("name is $name, age is $age")
    }
    fun upAge():Int{
        age++
        return age

    }

    fun change(age:Int){
        println(age)
    }

}
