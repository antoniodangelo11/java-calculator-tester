package org.lessons.tester;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        float result = Calculator.add(3.0f, 2.0f);
        assertEquals(5.0f, result);
        assertNotEquals(7.0f, result);

    }

    @Test
    public void testSubtract() {
        float result = Calculator.subtract(3.0f, 2.0f);
        assertEquals(1.0f, result);
        assertNotEquals(2.0f, result);
    }

    @Test
    public void testDivide() {
        float result = Calculator.divide(6.0f, 2.0f);
        assertEquals(3.0f, result);
        assertNotEquals(5.0f, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(5.0f, 0.0f);
        });
    }

    @Test
    public void testMultiply() {
        float result = Calculator.multiply(3.0f, 2.0f);
        assertEquals(6.0f, result);
    }
}

