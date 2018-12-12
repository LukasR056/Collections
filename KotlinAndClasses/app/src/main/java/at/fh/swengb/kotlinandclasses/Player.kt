package at.fh.swengb.kotlinandclasses

class Player(name: String,health:Int,attackStrength:Int,isAlive:Boolean,val level:Int, val experience:Int): LivingThing(name,health,attackStrength,isAlive){

}