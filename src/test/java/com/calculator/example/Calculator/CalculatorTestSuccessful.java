package com.calculator.example.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import com.calculator.example.calculator.Calculator;

public class CalculatorTestSuccessful {

	private static Calculator calculator;

	 

    @BeforeClass

    public static void initCalculator() {

        calculator = new Calculator();

    }

 

    @Before

    public void beforeEachTest() {

        System.out.println("This is executed before each Test");

    }

 @After

    public void afterEachTest() {

        System.out.println("This is exceuted after each Test");

    }

 

    @Test
    public void testSum() {

        int result = calculator.sum(3, 4);

 

        assertEquals(7, result);

    }

 

    @Test

    public void testDivison() {

        try {

            int result = calculator.divison(10, 2);

 

            assertEquals(5, result);

        } catch (Exception e) {

            e.printStackTrace(System.err);

        }

    }

    @Test(expected = Exception.class)

    public void testDivisionException() throws Exception {

        calculator.divison(10, 0);

    }

    //@Ignore

  /*  @Test

    public void testEqual() {

        boolean result = calculator.equalIntegers(20, 20);

        assertFalse(result);

    }*/

    @Ignore

    @Test
    public void testSubstraction() {

    	int result = calculator.subtraction(3, 4);
         assertTrue(result == -1);

    }
    @Test
    public void testmultiplication() {

        int result = calculator.multiplication(3, 4);
         assertTrue(result == 12);

    }
}
