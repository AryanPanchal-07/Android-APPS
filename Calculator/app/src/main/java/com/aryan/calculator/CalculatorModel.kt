package com.aryan.calculator

class CalculatorModel {
    private var firstNumber: Double = 0.0

    private var secondNumber : Double = 0.0


    private var result = 0.0

    private var operator = ""

     var firstNumberSet : Boolean = false
     var secondNumberSet : Boolean = false
     var operatorSet : Boolean = false

    fun setFirstNumber(num : Double){
        firstNumber = num
        firstNumberSet = true
    }

    fun setSecondNumber(num : Double)
    {
        secondNumber = num
        secondNumberSet = true
    }

    fun getResult() : Double {
        computeResult()
        return result
    }

    fun setOperator(op : String)
    {
        operator = op
        operatorSet = true
    }

    private fun computeResult(){
        if (firstNumberSet && secondNumberSet && operatorSet  ) {
            when (operator) {
                "+" -> {
                    result = firstNumber + secondNumber
                }
                "-" -> {
                    result = firstNumber - secondNumber
                }
                "X" -> {
                    result = firstNumber * secondNumber
                }
                "/" -> {
                    result = firstNumber / secondNumber
                }
            }
        }
        else
        {
            //nothing
        }
    }

    fun clear(){
        firstNumberSet = false
        secondNumberSet = false
        operatorSet = false
        firstNumber = 0.0
        secondNumber =0.0
        result = 0.0
        operator = ""
    }


}