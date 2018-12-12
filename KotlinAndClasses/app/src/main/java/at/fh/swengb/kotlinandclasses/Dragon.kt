package at.fh.swengb.kotlinandclasses

import android.util.Log

class Dragon(name: String,health:Int,attackStrength:Int,isAlive:Boolean): LivingThing(name,health,attackStrength,isAlive) {

    private fun breathFire(){
        Log.i("LivingThing","BURN BURN BURN")
    }

    override fun attack(attackee: LivingThing) {
        breathFire()
        super.attack(attackee)
    }
}