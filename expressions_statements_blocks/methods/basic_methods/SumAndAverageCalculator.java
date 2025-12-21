package expressions_statements_blocks.methods.basic_methods;

import java.util.Scanner;

/**
 * Interactive Summation And Average Calculator From User Input
 * 
 * This class demonstrates:
 * 1. Reading multiple integers from user input using Scanner
 * 2. Handling invalid input (non-integer values)
 * 3. Calculating sum and average of entered numbers
 * 4. Using Math.round() for rounding averages
 * 5. Type casting and conversion
 * 6. Loop until invalid input is encountered
 * 
 * Note: This method requires user interaction via Scanner.
 * In a real application, you would create the Scanner in main() and pass it,
 * or create it within the method. For demonstration, we create it in the method.
 */
public class SumAndAverageCalculator {

    /**
     * Reads integers from the keyboard and calculates their sum and average.
     * 
     * The method continues reading integers until the user enters a non-integer value.
     * When a non-integer is entered, it prints the sum and average of all entered numbers.
     * 
     * Format: "SUM = XX AVG = YY"
     * - XX: sum of all entered integers
     * - YY: calculated average (rounded) as a long
     * 
     * Examples:
     * Input: 1, 2, 3, 4, 5, a → Output: "SUM = 15 AVG = 3"
     * Input: hello → Output: "SUM = 0 AVG = 0"
     */
    public static void inputThenPrintSumAndAverage() {
        // Create Scanner to read input from keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Initialize counters and accumulators
        int sum = 0;
        int count = 0;
        
        // Keep reading integers until invalid input is encountered
        while (scanner.hasNextInt()) {
            // Read the next integer
            int number = scanner.nextInt();
            
            // Add to sum
            sum += number;
            
            // Increment count
            count++;
        }
        
        // Calculate average
        // Use long for average to match the return type of Math.round()
        long average = 0;
        
        if (count > 0) {
            // Calculate average as double first
            double averageDouble = (double) sum / count;
            
            // Round the average using Math.round() which returns long
            // Math.round() needs double as parameter, so we cast sum to double
            average = Math.round(averageDouble);
        }
        
        // Print the result in the specified format
        // Be mindful of spaces: "SUM = XX AVG = YY"
        System.out.println("SUM = " + sum + " AVG = " + average);
        
        // Close the scanner (good practice)
        scanner.close();
    }

    /**
     * Alternative implementation that accepts Scanner as parameter.
     * 
     * This version is more flexible as it allows the caller to manage
     * the Scanner lifecycle, which is better for testing and reuse.
     * 
     * @param scanner the Scanner object for reading input
     */
    public static void inputThenPrintSumAndAverage(Scanner scanner) {
        int sum = 0;
        int count = 0;
        
        // Read integers until non-integer input
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;
        }
        
        // Calculate average
        long average = 0;
        if (count > 0) {
            // Cast sum to double for division to get decimal result
            double averageDouble = (double) sum / count;
            // Round using Math.round() which returns long
            average = Math.round(averageDouble);
        }
        
        // Print result with proper spacing
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}

