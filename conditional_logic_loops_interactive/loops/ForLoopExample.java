package conditional_logic_loops_interactive.loops;

/**
 * For Loop Examples
 * 
 * This class demonstrates:
 * 1. Basic for loop with counter
 * 2. For loop with different increment/decrement values
 * 3. For loop iterating backwards
 * 4. For loop with multiple variables
 */
public class ForLoopExample {

    /**
     * Prints numbers from 1 to a specified limit using a for loop.
     * 
     * @param limit the upper bound (inclusive)
     * 
     * Examples:
     * printNumbers(5); → prints: 1 2 3 4 5
     * printNumbers(10); → prints: 1 2 3 4 5 6 7 8 9 10
     */
    public static void printNumbers(int limit) {
        // Basic for loop: initialize counter, condition, increment
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after printing
    }

    /**
     * Prints numbers in reverse order from limit down to 1.
     * 
     * @param limit the starting number (inclusive)
     * 
     * Examples:
     * printNumbersReverse(5); → prints: 5 4 3 2 1
     */
    public static void printNumbersReverse(int limit) {
        // For loop with decrement: start from limit, go down to 1
        for (int i = limit; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Prints even numbers up to a specified limit.
     * 
     * @param limit the upper bound (inclusive)
     * 
     * Examples:
     * printEvenNumbers(10); → prints: 2 4 6 8 10
     */
    public static void printEvenNumbers(int limit) {
        // Start from 2, increment by 2 each iteration
        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Calculates the sum of numbers from 1 to n.
     * 
     * @param n the upper bound (inclusive)
     * @return the sum of numbers from 1 to n
     * 
     * Examples:
     * sumNumbers(5); → returns 15 (1+2+3+4+5)
     * sumNumbers(10); → returns 55
     */
    public static int sumNumbers(int n) {
        int sum = 0;
        // Accumulate sum in each iteration
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Prints a multiplication table for a given number.
     * 
     * @param number the number to create multiplication table for
     * @param limit the number of rows to print
     * 
     * Examples:
     * printMultiplicationTable(5, 10); → prints 5x1=5, 5x2=10, ..., 5x10=50
     */
    public static void printMultiplicationTable(int number, int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

