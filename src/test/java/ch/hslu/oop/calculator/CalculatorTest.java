package ch.hslu.oop.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    ICalculator calculator = new Calculator();


    @Test
    void addition() {
        assertEquals(5,calculator.addition(2,3));
        assertEquals(3,calculator.addition(0,3));
        assertEquals(-4,calculator.addition(-4,0));
        assertEquals(0, calculator.addition(0,0));

    }
}