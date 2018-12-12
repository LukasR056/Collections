package at.fh.swengb.kotlinandclasses

import android.util.Log

class Lion(name: String,attackStrength:Int,isAlive:Boolean): LivingThing(name,50,attackStrength,isAlive)  // mit diesem Wert drinnen startet jeder Lion mit 50 Lebenspunkte. Fixwert
{
    init {
        roar()  //init Blöcke werden beim Erstellen des Objektes ausgeführt. gehört zum Primary Konstruktor um dort Logik einzubauen
    }

    private fun roar(){
     Log.i("LivingThing","RRRROOOOOOOAAAAARRRR")
    }
}