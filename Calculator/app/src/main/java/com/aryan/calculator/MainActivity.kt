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

        var calculatorModel = CalculatorModel();
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val txtView: TextView = findViewById(R.id.numberDisplay)
            txtView.text="0"
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
                "C" -> {
                    calculatorModel.clear()
                    currentNumber = "0"
                    startNumber=true
                }
                "+", "-", "X", "/"  -> {
                    if(calculatorModel.firstNumberSet && calculatorModel.operatorSet)
                    {
                        calculatorModel.setSecondNumber(currentNumber.toDouble())
                        currentNumber = calculatorModel.getResult().toString()
                    }
                    calculatorModel.setFirstNumber(currentNumber.toDouble())
                    calculatorModel.setOperator(buttonText)
                    startNumber = true
                }
                "^" -> {
                    if(calculatorModel.firstNumberSet && calculatorModel.operatorSet)
                    {
                        calculatorModel.setSecondNumber(currentNumber.toDouble())
                        currentNumber = calculatorModel.getResult().toString()
                    }
                    calculatorModel.setFirstNumber(currentNumber.toDouble())
                    calculatorModel.setOperator(buttonText)
                    currentNumber = calculatorModel.getResult().toString()
                    startNumber = true
                }
                "=" -> {
                    calculatorModel.setSecondNumber(currentNumber.toDouble())
                    currentNumber = calculatorModel.getResult().toString()
                    calculatorModel.clear()
                    startNumber = true
                }

            }
            textView.text = currentNumber


        }
    }