package at.fh.swengb.kotlinandviews



class Student(name: String, val currentSemester: Int) : Person(name)
{
    override fun print(): String {
        return "$name is in the $currentSemester. Semester"

    }
}