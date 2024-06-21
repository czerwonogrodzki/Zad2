package com.pam.zad2.viewmodel

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test


class CalculatorViewModelTest {
    private lateinit var calculatorViewModel : CalculatorViewModel
    @Test
    fun calculate() {
        calculatorViewModel = CalculatorViewModel()

        val result = calculatorViewModel.calculate(2, 2).sum

        assertEquals(4, result)
    }

    @Test
    fun calculateFail(){
        calculatorViewModel = CalculatorViewModel()

        val result = calculatorViewModel.calculate(2, 2).sum

        assertNotEquals(543, result)
    }
}