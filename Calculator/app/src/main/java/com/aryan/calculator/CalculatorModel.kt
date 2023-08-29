package com.aryan.calculator

import java.util.Scanner
import kotlin.math.sqrt

class CalculatorModel {
    val scanner = Scanner(System. `in`)
    private var firstNumber: Double = 0.0

    private var secondNumber : Double = 0.0


    private var result = 0.0

    private var operator = ""

    var sqrtNumberSet : Boolean = false
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
                "^" -> {
                    result = firstNumber * firstNumber
                }

            }
        }
        else if(firstNumberSet)
        {
            when(operator){
                "^" -> {
                    result = firstNumber * firstNumber
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
        sqrtNumberSet = false
        firstNumber = 0.0
        secondNumber =0.0
        result = 0.0
        operator = ""
    }


}