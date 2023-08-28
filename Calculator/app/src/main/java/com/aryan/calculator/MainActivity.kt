package com.aryan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun buttonClick(view: View) {

        //which button is pressed
        val button: Button = view as Button
        val buttonText: String = button.text.toString();

        Log.i("button", "Button Clicked :$buttonText")
    }
}