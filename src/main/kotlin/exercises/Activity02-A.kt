fun main() {

    var students = arrayListOf<String>("maria makiling, juan dela cruz")
    var grades = arrayListOf(String,Int)
    var attendance =  arrayListOf(String,Int)
    var inquireStatus = arrayListOf<String>()



    students.add("john wick")
    students.add("john cena")
    students.add("dear john")




    do {
        println()
        println("Options")
        println("[1] list of students")
        println("[2] add students")
        println("[3] encode grades")
        println("[4] encode attendance")
        println("[5] inquire student status")
        println("[0] Exit")


        var options: Int = readln().toInt()

        if (options == 1) {
            println("These are the list of students")
            println(students)

        }

        if (options == 2) {
            println("add new student")
            println("please enter student name")
            var newStudent: String = readln().toString()
            students.add(newStudent)
            println("new student added")

        }

        if (options == 3) {
            println("encode grades")
            println("please enter student name")
            var studentNameGrade: String = readln().toString()
            if (studentNameGrade in students)
                println("please enter $studentNameGrade grades")
            var studentGrade: Int = readln().toInt()
            println("grade encoded")
            var nameGrade = studentNameGrade + studentGrade
            grades.add(nameGrade)

        }
        if (options == 4) {
            println("encode attendance")
            println("please enter student name")
            var studentNameAttendance: String = readln().toString()
            if (studentNameAttendance in students)
                println("please enter $studentNameAttendance grades")
            var studentAttendance: Int = readln().toInt()
            println("grade encoded")
            var nameAttendance = studentNameAttendance + studentAttendance
            attendance.add(nameAttendance)



        }

            if (options == 5) {
                println("status inquiry")
                println("please enter student name")
                var studentNameStatus: String = readln().toString()
                if (studentNameStatus in students)
                    println("$studentNameStatus Grades are $grades")
                    println("$studentNameStatus attendance are $attendance")

        }

        if (options == 0) {
            println("Thank you")


        }


    } while (options > 0)

}
