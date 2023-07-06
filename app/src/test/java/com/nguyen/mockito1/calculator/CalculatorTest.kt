package com.nguyen.mockito1.calculator

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {
    lateinit var calculator: Calculator

    @Mock
    lateinit var operators: Operators

    @Before
    fun setUp() {
        calculator = Calculator(operators)
    }

    @Test
    fun givenValidInput_whenAdd_shouldCallAddOperator() {
        val a = 10
        val b = 20
        calculator.addTwoNumbers(a, b)
        // verify that the add method from the mock object is called
        verify(operators).add(a, b)
    }

    @Test
    fun givenValidInput_whenSubtract_shouldCallSubtractOperator() {
        val a = 10
        val b = 20
        calculator.subtractTwoNumbers(a, b)
        verify(operators).subtract(a, b)
    }

    @Test
    fun givenValidInput_whenMultiply_shouldCallMultiplyOperator() {
        val a = 10
        val b = 20
        calculator.multiplyTwoNumbers(a, b)
        verify(operators).multiply(a, b)
    }

    @Test
    fun givenValidInput_whenDivide_shouldCallDivideOperator() {
        val a = 10
        val b = 20
        calculator.divideTwoNumbers(a, b)
        verify(operators).divide(a, b)
    }
}