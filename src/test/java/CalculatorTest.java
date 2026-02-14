import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() throws Exception {
        int expected = 5;
        int actual = calculator.subtract(15, 10);
        assertEquals(expected, actual);
        assertDoesNotThrow(() -> calculator.subtract(15, 10));
    }

    @Test
    public void testSubtractException() {
        assertThrows(Exception.class, () -> calculator.subtract(10, 15));
    }

    @Test
    public void testMultiply() {
        int expected = 6;

        int actual = calculator.multiply(3, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 5;

        int actual = calculator.divide(10, 2);

        assertEquals(expected, actual);
    }

}
