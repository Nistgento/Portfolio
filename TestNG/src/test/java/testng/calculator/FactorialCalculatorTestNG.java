package testng.calculator;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import main.java.calculator.FactorialCalculator;

public class FactorialCalculatorTestNG {
    @Test
    public void testCalculateFactorial() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
        assertEquals(FactorialCalculator.calculateFactorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeInput() {
        FactorialCalculator.calculateFactorial(-1);
    }
}