package testng.calculator;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import main.java.calculator.TriangleAreaCalculator;

public class TriangleAreaCalculatorTestNG {
    @Test
    public void testCalculateArea() {
        assertEquals(TriangleAreaCalculator.calculateArea(5, 4), 10.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInput() {
        TriangleAreaCalculator.calculateArea(-1, 2);
    }
}