package at.fh.swengb.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addNumbers(view: View) {

        val editTextNumber1 = findViewById(R.id.editNumber1) as EditText
        val editTextNumber2 = findViewById(R.id.editNumber2) as EditText

        val result = findViewById(R.id.textViewResult) as TextView

        val num1String = editTextNumber1.text.toString()
        val num2String = editTextNumber2.text.toString()

        try {
            val num1 = num1String.toDouble()
            val num2 = num2String.toDouble()
            result.text = "${num1} + ${num2} = ${num1+num2}"
        } catch (e: NumberFormatException) {
            result.text = "Wrong input!!!"
            e.printStackTrace()
        }

    }





}


