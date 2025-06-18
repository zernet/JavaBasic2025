package com.gmail.zernetcsgo.hw16;
import com.gmail.zernetcsgo.hw16.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test void testAdd() { assertEquals(5.0, calc.add(2, 3)); }
    @Test void testSubtract() { assertEquals(1.0, calc.subtract(4, 3)); }
    @Test void testMultiply() { assertEquals(12.0, calc.multiply(4, 3)); }
    @Test void testDivide() { assertEquals(2.0, calc.divide(6, 3)); }
    @Test void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}
