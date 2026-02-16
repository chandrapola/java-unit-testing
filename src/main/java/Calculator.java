/**
 * A simple calculator class for basic arithmetic operations.
 */
public final class Calculator {

    /**
     * Adds two integers.
     *
     * @param x the first operand
     * @param y the second operand
     * @return the sum of x and y
     */
    public static int add(final int x, final int y) {
        return x + y;
    }

    /**
     * Subtracts y from x.
     *
     * @param x the minuend (first operand)
     * @param y the subtrahend (second operand)
     * @return the difference of x minus y
     * @throws Exception if x is less than y
     */
    public static int subtract(final int x, final int y) throws Exception {
        if (x < y) {
            throw new Exception("The first argument is small");
        }
        return x - y;
    }

    /**
     * Multiplies two integers.
     *
     * @param x the first operand
     * @param y the second operand
     * @return the product of x and y
     */
    public static int multiply(final int x, final int y) {
        return x * y;
    }

    /**
     * Divides x by y.
     *
     * @param x the dividend (first operand)
     * @param y the divisor (second operand)
     * @return the quotient of x divided by y
     */
    public static int divide(final int x, final int y) {
        return x / y;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private Calculator() {
        throw new AssertionError("Cannot instantiate Calculator");
    }
}
