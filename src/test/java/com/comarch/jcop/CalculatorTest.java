package com.comarch.jcop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Comarch on 2016-09-29.
 */
public class CalculatorTest {
    Calculator calc;

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
        assertTrue("subtract result: " + result, result == 3);
    }

    @Test
    public void multiply() throws Exception {
        int result = calc.multiply(1,2);
        assertTrue("add result: " + result, result == 3);
    }

    @Test
    public void divide() throws Exception {
        int result = calc.divide(1,2);
        assertTrue("add result: " + result, result == 3);
    }

}