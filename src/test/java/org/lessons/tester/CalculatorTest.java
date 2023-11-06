package org.lessons.tester;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Somma")
    public void testAdd() {
        float result = Calculator.add(3.0f, 2.0f);
        assertEquals(5.0f, result);
        assertNotEquals(7.0f, result);

    }

    @Test
    @DisplayName("Sottrazione")
    public void testSubtract() {
        float result = Calculator.subtract(3.0f, 2.0f);
        assertEquals(1.0f, result);
        assertNotEquals(2.0f, result);
    }

    @Test
    @DisplayName("Divisione")
    public void testDivide() {
        float result = Calculator.divide(6.0f, 2.0f);
        assertEquals(3.0f, result);
        assertNotEquals(5.0f, result);
    }

    @Test
    @DisplayName("Divisione con 0")
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(5.0f, 0.0f);
        });
    }

    @Test
    @DisplayName("Moltiplicazione")
    public void testMultiply() {
        float result = Calculator.multiply(3.0f, 2.0f);
        assertEquals(6.0f, result);
    }
}

