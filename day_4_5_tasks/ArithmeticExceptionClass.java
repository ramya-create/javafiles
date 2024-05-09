package day_4_5_tasks;

public class ArithmeticExceptionClass {
    public static void main(String[] args) {
        int divnd = 10;
        int divsr = 0;

        try {
            int result = divide(divnd, divsr);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}