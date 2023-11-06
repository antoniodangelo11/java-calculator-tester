package org.lessons.tester;

public interface Calculator {

    // METODI
    static float add(float num1, float num2) {
        return num1 + num2;
    }

    static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    static float divide(float num1, float num2) throws IllegalArgumentException {
        if (num2 ==0) {
            throw new IllegalArgumentException("Non puoi dividere per 0");
        }
        return num1 / num2;
    }

    static float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
