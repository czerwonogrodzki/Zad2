package com.pam.zad2.viewmodel

import androidx.lifecycle.ViewModel
import com.pam.zad2.model.CalculatorModel

class CalculatorViewModel : ViewModel() {
    fun calculate(num1: Int, num2: Int) : CalculatorModel{
        return CalculatorModel(num1, num2, num1 + num2)
    }
}