package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val test = listOf<Student>(Student("Max",2),Student("Cyntea",2),
            Student("Clemens",2), Student
                ("Janik",2), Student
                ("Michael",2))

        Log.v("Students",test[1].name.toString()) //kann nichts hinzufügen bei einer normalen Liste

        //mutablelist
        val mtest = mutableListOf<Student>(Student("Max",2),Student("Cyntea",2),
            Student("Clemens",2), Student
                ("Janik",2), Student
                ("Michael",2))

        Log.v("Students",mtest[2].name)
        mtest[2] = Student("Gerhard",2)

        Log.v("Students",mtest[2].name)

        mtest.add(Student("Anna",2))

        for (i in mtest)
            (
                    Log.v("Student", i.name.toString())

                    )
        //Set, anderer Tag


        val stest = setOf<Student>(Student("Max",2), Student("Max",2),
            Student("Cynthea",3), Student
        ("Clemens",2)
        )

        for (i in stest)
            (
                    Log.v("setstudent", i.name.toString())

                    )

        val mstest = mutableSetOf<Student>(Student("Max",2), Student("Max",2),
            Student("Cynthea",3), Student
                ("Clemens",2), Student("Rob",2)
        )

        mstest.add(Student("Cynthea",2))
        mstest.add(Student("Gerhard",1))
        for (i in mstest)
            (
                    Log.v("msetstudents", i.name.toString() + " current Semeseter "+i.currentSemester.toString())

                    )

        for (i in mstest)
            (
                    if (i.name == "Rob")    //es gibt auch eine .find funktion
                    Log.v("onlyRob", i.name.toString() + " current Semeseter "+i.currentSemester.toString())

                    )

        //map

        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)


        for ((key, value) in studentMap)
        {
            for (i in value)
            {
                Log.v("map2", "$key: ${i.name}")
            }
        }

        ima17List.add(Student("michi",2))
        for ((key, value) in studentMap)
        {
            for (i in value)
            {
                Log.v("map2", "$key: ${i.name}")
            }
        }

        val mmap = studentMap.toMutableMap()

        val ima16List = listOf(Student("Lukas", 5), Student("Jony", 1))

        mmap.set("ima16",ima16List)
        for ((key, value) in mmap)
        {
            for (i in value)
            {
                Log.v("mmap", "$key: ${i.name}")
            }
        }



    }







}
