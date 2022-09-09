fun main (){

    var mySet = setOf(2,3,4,5,6,7,8,8,8,2,2,2)

    var mySet2 =    mutableSetOf<Int>()
    mySet2.add(5)
    mySet2.add(7)
    mySet2.add(8)
    mySet2.add(9)

    println(mySet.count())
    print(mySet.sum())
    print(mySet.average())


    for (data in mySet){
        println(data)

}
    var setA = setOf(2,3,5,7)
    var setB = setOf(4,8,6)

     println(setA.union(setB))
     println(setA.intersect(setB))
     println(setA.minus(setB))
    println(setB.minus(setA))










}