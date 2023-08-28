package com.aryan.calculator

class CalculatorModel {
    var firstNumber: Double = 0.0
    var secondNumber : Double = 0.0
    var result : Double = 0.0

    var operator : String = ""

    fun setFirstNumber(num : Double){
        firstNumber = num

    }

    fun setSecondNumber(num : Double)
    {
        secondNumber = num
    }

    fun getResult() : Double {
        return result
    }

    fun setOperator(op : String)
    {
        operator = op
    }
}