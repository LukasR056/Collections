package at.fh.swengb.kotlinandviews

interface Printable //with this interface different classes can collect together in order to print
{
    fun print(): String
}

open class Person(val name: String) : Printable
{
    override fun print(): String {
        return name
    }
}