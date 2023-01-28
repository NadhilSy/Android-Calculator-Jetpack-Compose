package com.app.nadhil.calculatorcompose

sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Substract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
}
