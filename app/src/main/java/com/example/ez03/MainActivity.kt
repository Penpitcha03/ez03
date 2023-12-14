package com.example.ez03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set click listeners for operator buttons
        val plus: Button = findViewById(R.id.plus)
        val Minus: Button = findViewById(R.id.Minus)
        val Multiply: Button = findViewById(R.id.Multiply)
        val divider: Button = findViewById(R.id.divider)
        val Modulo: Button = findViewById(R.id.Modulo)
        val Clear: Button = findViewById(R.id.Clear)
        val editTextNumber: EditText = findViewById(R.id.editTextNumber)
        val editTextNumber2: EditText = findViewById(R.id.editTextNumber2)
        val textView6: TextView = findViewById(R.id.textView6)
        val textView7: TextView = findViewById(R.id.textView7)

        plus.setOnClickListener {
            if (editTextNumber.text.toString() == "" || editTextNumber2.text.toString() == "") {
                Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
            } else {
                var a = editTextNumber.text.toString().toInt() + editTextNumber2.text.toString().toInt()
                textView6.setText("+")
                textView7.setText(a.toString())
            }
        }
        Minus.setOnClickListener {
            if (editTextNumber.text.toString() == "" || editTextNumber2.text.toString() == "") {
                Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
            } else {
                var x = editTextNumber.text.toString().toInt() - editTextNumber2.text.toString().toInt()
                textView6.setText("-")
                textView7.setText(x.toString())
            }
            Multiply.setOnClickListener {
                if (editTextNumber.text.toString() == "" || editTextNumber2.text.toString() == "") {
                    Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT).show()
                } else {

                    var x = editTextNumber.text.toString().toInt() * editTextNumber2.text.toString()
                            .toInt()
                    textView6.setText("*")
                    textView7.setText(x.toString())
                }
                divider.setOnClickListener {
                    if (editTextNumber.text.toString() == "" || editTextNumber2.text.toString() == "") {
                        Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT)
                            .show()
                    } else {

                    var x = editTextNumber.text.toString().toDouble() / editTextNumber2.text.toString()
                            .toDouble()
                    textView6.setText("/")
                    textView7.setText(x.toString())
                }
            }
                Modulo.setOnClickListener {
                    if (editTextNumber.text.toString() == "" || editTextNumber2.text.toString() == "") {
                        Toast.makeText(this, "Please input num1 and num2!!", Toast.LENGTH_SHORT)
                            .show()
                    } else {

                    var x =
                        editTextNumber.text.toString().toDouble() % editTextNumber2.text.toString()
                            .toDouble()
                    textView6.setText("%")
                    textView7.setText(x.toString())
                }}
                Clear.setOnClickListener {
                    editTextNumber.setText("")
                    textView6.setText("")
                    editTextNumber2.setText("")
                    textView7.setText("")
                }


            }
        }
    }
}







