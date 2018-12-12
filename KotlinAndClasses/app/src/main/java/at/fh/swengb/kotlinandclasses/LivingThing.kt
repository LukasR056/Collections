package at.fh.swengb.kotlinandclasses

import android.util.Log

open class LivingThing(val name: String, var health: Int, val attackStrength: Int, var isAlive: Boolean) {
    open fun attack(attackee: LivingThing) {
        Log.i("LivingThing", "${name} is attacking ${attackee.name} with attackStrength: ${attackStrength}")
        attackee.takeDamageFrom(this, attackStrength)

    }

    fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        Log.i("LivingThing", "${name} is taking ${attacker.attackStrength} damage from: ${attacker.name}")
        if (health >=0)
        {
            health = health - damage
            Log.i("LivingThing", "${name} has ${health}")
        }
        if (health <= 0)
        {
            isAlive = false
            Log.i("LivingThing", "${name} is dead now and was beaten by ${attacker.name}")
        }
    }
}