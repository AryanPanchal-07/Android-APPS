package com.aryan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var startNumber: Boolean = true;
    val acceptingDigit: Boolean = true;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtView: TextView = findViewById(R.id.numberDisplay)
        txtView.text=""
    }


    fun buttonClick(view: View) {

        //which button is pressed
        val button: Button = view as Button
        val buttonText: String = button.text.toString()

        Log.i("button", "Button Clicked :$buttonText")

        val textView: TextView = findViewById(R.id.numberDisplay)
        var currentNumber = textView.text.toString()

        //What Happens when button is pressed
        when (buttonText) {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "." -> {
                if(startNumber)
                {
                    if(buttonText.equals("."))
                    {
                        currentNumber = "0."
                    }
                    else {
                        currentNumber = buttonText;
                    }
                    startNumber = false
                }
                else
                {
                    if(buttonText.equals(".") && currentNumber.contains("."))
                    {

                    }
                    else {
                        currentNumber += buttonText
                    }
                }

            }
        }
        textView.text = currentNumber

        when (buttonText) {
            "C" -> {
                currentNumber = ""
                textView.text = currentNumber
            }
        }

    }
}