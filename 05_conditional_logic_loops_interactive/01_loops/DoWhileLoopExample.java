package conditional_logic_loops_interactive.loops;

/**
 * Do-While Loop Examples
 * 
 * This class demonstrates:
 * 1. Do-while loop (executes at least once)
 * 2. Post-condition checking
 * 3. Menu-driven programs
 * 4. When to use do-while vs while
 */
public class DoWhileLoopExample {

    /**
     * Prints numbers from 1 to limit using a do-while loop.
     * 
     * Note: Do-while executes the body at least once, even if condition is false initially.
     * 
     * @param limit the upper bound (inclusive)
     * 
     * Examples:
     * printNumbersDoWhile(5); → prints: 1 2 3 4 5
     */
    public static void printNumbersDoWhile(int limit) {
        int i = 1;
        // Execute body first, then check condition
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= limit); // Check condition after execution
        System.out.println();
    }

    /**
     * Simulates a menu selection that continues until user chooses to exit.
     * 
     * This demonstrates a common use case for do-while: menu-driven programs
     * where you want to show the menu at least once.
     * 
     * @param choice the user's menu choice (0 to exit)
     * 
     * Examples:
     * processMenu(1); → prints menu option 1
     * processMenu(0); → prints exit message
     */
    public static void processMenu(int choice) {
        // Do-while ensures menu is shown at least once
        do {
            if (choice == 1) {
                System.out.println("Option 1 selected");
            } else if (choice == 2) {
                System.out.println("Option 2 selected");
            } else if (choice == 3) {
                System.out.println("Option 3 selected");
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break; // Exit the loop
            } else {
                System.out.println("Invalid choice");
            }
            // In a real application, you would read the next choice here
            // For this example, we break after first iteration
            break;
        } while (choice != 0);
    }

    /**
     * Calculates the sum of numbers until the sum exceeds a threshold.
     * 
     * @param threshold the maximum sum value
     * @return the number of iterations needed
     * 
     * Examples:
     * sumUntilThreshold(10); → returns 4 (1+2+3+4=10, stops at 4)
     */
    public static int sumUntilThreshold(int threshold) {
        int sum = 0;
        int number = 1;
        int count = 0;
        
        // Keep adding numbers until sum exceeds threshold
        do {
            sum += number;
            number++;
            count++;
        } while (sum <= threshold);
        
        return count;
    }

    /**
     * Demonstrates that do-while executes at least once.
     * 
     * Even if the condition is false initially, the body executes once.
     * 
     * @param value a value to demonstrate the behavior
     * 
     * Examples:
     * demonstrateAtLeastOnce(0); → prints "Executed at least once" even though condition is false
     */
    public static void demonstrateAtLeastOnce(int value) {
        // This will execute once even if value is already > 10
        do {
            System.out.println("Executed at least once: " + value);
            value++;
        } while (value <= 10);
    }
}

