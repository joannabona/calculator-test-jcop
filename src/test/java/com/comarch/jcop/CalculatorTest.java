package com.comarch.jcop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void initialize(){
        calc = new Calculator();
    }
    @Test
    public void add() throws Exception {
        int result = calc.add(1,2);
        assertTrue("add result: " + result, result == 3);
    }

    @Test
    public void subtract() throws Exception {
        int result = calc.subtract(2,2);
        assertTrue("subtract result: " + result, result == 0);
    }

    @Test
    public void multiply() throws Exception {
        int result = calc.multiply(1,2);
        assertTrue("multiply result: " + result, result == 2);
    }

    @Test
    public void divide() throws Exception {
        int result = calc.divide(2,2);
        assertTrue("add divide: " + result, result == 1);
    }

}