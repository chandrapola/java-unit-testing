import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {

    /**
     * Test addition of two positive integers.
     */
    @Test
    public void testAdd() {
        final int expected = 3;
        final int actual = Calculator.add(1, 2);
        assertEquals(expected, actual);
    }

    /**
     * Test subtraction of two integers.
     *
     * @throws Exception if subtraction fails
     */
    @Test
    public void testSubtract() throws Exception {
        final int expected = 5;
        final int actual = Calculator.subtract(15, 10);
        assertEquals(expected, actual);
        assertDoesNotThrow(() -> Calculator.subtract(15, 10));
    }

    /**
     * Test subtraction throws exception when first argument is smaller.
     */
    @Test
    public void testSubtractException() {
        assertThrows(Exception.class, () -> Calculator.subtract(10, 15));
    }

    /**
     * Test multiplication of two integers.
     */
    @Test
    public void testMultiply() {
        final int expected = 6;
        final int actual = Calculator.multiply(3, 2);
        assertEquals(expected, actual);
    }

    /**
     * Test division of two integers.
     */
    @Test
    public void testDivide() {
        final int expected = 5;
        final int actual = Calculator.divide(10, 2);
        assertEquals(expected, actual);
    }
}
