package at.fh.swengb.kotlinandclasses

import kotlin.math.PI

class Circle(val r:Double): Shape {     //Shape() die Klammer bedeutet, dass ein Konstruktor aufgerufen wird
    override fun calculateArea(): Double {
        return r*r* PI  //return PI * r.pow(2)
    }
}