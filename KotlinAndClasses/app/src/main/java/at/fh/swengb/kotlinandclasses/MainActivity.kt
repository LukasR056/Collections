package at.fh.swengb.kotlinandclasses

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf<Shape>(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0))    // mit listof<Circle> kann man enforcen dass die Liste nur von der Klasse shape beinhalten kann
                    // so ist die Liste gemischt von den Datentypen her, auch wenn es nicht so aussieht so leiten sich alle von der "obersten" Klasse any ab.
                    //deswegen sind dann alle eigentlich von typ any.
        for (i in list) {   //statt i kann man auch item schreiben
            Log.w("SHAPE", "${i.calculateArea()}")
        }

        val Myperson = Player("Janik",30,10,true,4,5)
        val mylion = Lion("Goffrey",20,true) //Jz braucht man beim Lion keinen health mehr eingeben weil er ja einen Fixwert bekommen hat.
        val mydragon =  Dragon("Drogo",40,20,true)



        Myperson.attack(mylion)
        Myperson.attack(mylion)
        Myperson.attack(mylion)
        mydragon.attack(Myperson)


    }



}
