fun main () {
    var age: Int = 1

    if ((age >= 0) && (age <= 17)) {
        println("underage")
    } else if ((age >= 18) && (age <= 30)) {
        println("young adult")
    } else if ((age >= 31) && (age <= 59)) {
        println("adult")
    } else if (age >= 60) {
        println("senior")
    }

}