package at.fh.swengb.kotlinandclasses

class Square(a:Double): Rectangle(a,a) { // hier muss bei Rectangle a,a reinkommen weil Rectangle zwei Parameter hat. hier kein val weil "a" schon in Rectangle vorher deklariert
    override fun calculateArea(): Double {
        return a*a
    }
}