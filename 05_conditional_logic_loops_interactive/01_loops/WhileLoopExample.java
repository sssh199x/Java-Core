package conditional_logic_loops_interactive.loops;

/**
 * While Loop Examples
 * 
 * This class demonstrates:
 * 1. Basic while loop with condition
 * 2. While loop for input validation
 * 3. While loop for processing until condition is met
 * 4. Infinite loop prevention
 */
public class WhileLoopExample {

    /**
     * Counts down from a number to 1 using a while loop.
     * 
     * @param start the starting number
     * 
     * Examples:
     * countDown(5); → prints: 5 4 3 2 1
     */
    public static void countDown(int start) {
        int current = start;
        // Continue while condition is true
        while (current >= 1) {
            System.out.print(current + " ");
            current--; // Decrement to avoid infinite loop
        }
        System.out.println();
    }

    /**
     * Calculates the factorial of a number using a while loop.
     * 
     * @param n the number to calculate factorial for (must be non-negative)
     * @return the factorial of n, or -1 if n is negative
     * 
     * Examples:
     * factorial(5); → returns 120 (5*4*3*2*1)
     * factorial(0); → returns 1
     */
    public static long factorial(int n) {
        if (n < 0) {
            return -1; // Invalid input
        }
        
        long result = 1;
        int i = n;
        
        // Multiply while i is greater than 1
        while (i > 1) {
            result *= i;
            i--; // Decrement to progress toward termination
        }
        
        return result;
    }

    /**
     * Finds the sum of digits in a number using a while loop.
     * 
     * @param number the number to sum digits of
     * @return the sum of all digits
     * 
     * Examples:
     * sumOfDigits(123); → returns 6 (1+2+3)
     * sumOfDigits(456); → returns 15 (4+5+6)
     */
    public static int sumOfDigits(int number) {
        int sum = 0;
        int num = Math.abs(number); // Handle negative numbers
        
        // Extract digits one by one
        while (num > 0) {
            sum += num % 10; // Get last digit
            num /= 10; // Remove last digit
        }
        
        return sum;
    }

    /**
     * Counts how many times a number can be divided by 2 before reaching 1.
     * 
     * @param number the number to divide
     * @return the count of divisions, or -1 if number is not positive
     * 
     * Examples:
     * countDivisionsByTwo(16); → returns 4 (16→8→4→2→1)
     * countDivisionsByTwo(1); → returns 0
     */
    public static int countDivisionsByTwo(int number) {
        if (number <= 0) {
            return -1;
        }
        
        int count = 0;
        int num = number;
        
        // Divide by 2 until we reach 1
        while (num > 1) {
            num /= 2;
            count++;
        }
        
        return count;
    }
}

