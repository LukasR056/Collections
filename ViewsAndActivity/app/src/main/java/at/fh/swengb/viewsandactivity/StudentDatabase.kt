package at.fh.swengb.viewsandactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_student_database.*

class StudentDatabase : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_database)
    }

    private val students = mutableListOf<Student>() //auch wenn es ein value ist, kann man es ändern durch multableListOF


    fun addStudent(view: View)
    {
        val name = name_input.text.toString()
        val currentSemester = current_semester_input.text.toString().toIntOrNull() ?:0

        if ( currentSemester >0 )
        {
            val newStudent = Student(name, currentSemester);
            students.add(newStudent)
        }

        name_input.text.clear()
        current_semester_input.text.clear()

        students.removeAll { it.currentSemester >3 }

    }

    fun listallstudents(view: View)
    {
        for (i in students) {
            Log.v("neuerstellter", i.name+" is in the  ${i.currentSemester} semester." )
        }
    }
}

