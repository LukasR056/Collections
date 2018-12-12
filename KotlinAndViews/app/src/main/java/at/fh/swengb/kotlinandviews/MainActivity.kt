package at.fh.swengb.kotlinandviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private val students = mutableListOf<Student>()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //Alt + Enter um die Libraries zu laden
        logThings()
        logMyVariable()
        loopThings()

        val myPerson = Person("Janik")
        printPrintable(myPerson)
        val myStudent = Student("Michael",3)
        printPrintable(myStudent)





    }

    fun addStudent(view: View) {
        val name = name_input.text.toString()
        val age = age_input.text.toString().toInt()
        val newStudent = Student(name,age)



        //There's something missing, Yes but what ?!

        students.add(newStudent)

    }

    private fun loopThings() {
        for (i in 0..20) // until would be without 20
        {

            Log.v("MyActivity", "$i")
        }
        for (i in 20 downTo 0 step 2) {
            if (i == 10) {
                continue
            } else {
                Log.v("MyActivity", "$i")
            }
        }
        var itwo = 20
        while (itwo > 0) //wenn hier false rauskommt wird es abgebrochen
        {
            if (itwo == 15) {
                break
            } else {
                Log.v("MyActivity", "$itwo")
                itwo--
            }
        }
    }

    fun logThings() //Default is it public
    {
        Log.v("MyActivity", "Hello Logcat Verbose")  //Sind gefiltert unten je nach Tag, Wenn man eines auswählt so wird alles darunter mit angezeigt darüber nicht
        Log.d("MyActivity", "Hello Logcat Debug")
        Log.i("MyActivity", "Hello Logcat Info")
        Log.w("MyActivity", "Hello Logcat Warning")
        Log.e("MyActivity", "Hello Logcat Error")
    }
    fun logMyVariable()
    {
        var firstString = "first"
        val textofitin = "Hello Variables"
        firstString = textofitin
        //  textofitin = "testing" -- Values cannot be resign
        Log.v("MyActivity", "$firstString")
    }
    fun printPrintable(printable: Printable)
    {
        Log.d("MyActivity",printable.print())

    }
}

