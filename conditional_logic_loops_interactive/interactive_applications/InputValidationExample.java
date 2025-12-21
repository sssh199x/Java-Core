package conditional_logic_loops_interactive.interactive_applications;

import java.util.Scanner;

/**
 * Input Validation Examples
 * 
 * This class demonstrates:
 * 1. Validating user input
 * 2. Handling invalid input gracefully
 * 3. Prompting until valid input is received
 * 4. Range validation
 * 5. Type validation
 * 
 * Note: Methods accept Scanner as parameter for demonstration.
 */
public class InputValidationExample {

    /**
     * Prompts user for a positive integer and validates input.
     * 
     * @param scanner the Scanner object for input
     * @return a valid positive integer
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * int number = getPositiveInteger(scanner);
     * // Keeps prompting until user enters a positive number
     */
    public static int getPositiveInteger(Scanner scanner) {
        int number;
        
        // Keep asking until valid input
        while (true) {
            System.out.print("Enter a positive integer: ");
            
            // Check if input is an integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                // Check if it's positive
                if (number > 0) {
                    return number; // Valid input, exit loop
                } else {
                    System.out.println("Error: Number must be positive. Try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
        }
    }

    /**
     * Prompts user for a number within a specific range.
     * 
     * @param scanner the Scanner object for input
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return a valid number within the range
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * int number = getNumberInRange(scanner, 1, 100);
     * // Keeps prompting until user enters number between 1 and 100
     */
    public static int getNumberInRange(Scanner scanner, int min, int max) {
        int number;
        
        while (true) {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                if (number >= min && number <= max) {
                    return number; // Valid input
                } else {
                    System.out.println("Error: Number must be between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
        }
    }

    /**
     * Prompts user for yes/no answer and validates input.
     * 
     * @param scanner the Scanner object for input
     * @param prompt the question to ask
     * @return true for yes, false for no
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * boolean answer = getYesNo(scanner, "Do you want to continue?");
     * // Accepts: yes, y, no, n (case-insensitive)
     */
    public static boolean getYesNo(Scanner scanner, String prompt) {
        String input;
        
        while (true) {
            System.out.print(prompt + " (yes/no): ");
            input = scanner.next().toLowerCase(); // Convert to lowercase
            
            if (input.equals("yes") || input.equals("y")) {
                return true;
            } else if (input.equals("no") || input.equals("n")) {
                return false;
            } else {
                System.out.println("Error: Please enter 'yes' or 'no'.");
            }
        }
    }

    /**
     * Validates that a string is not empty.
     * 
     * @param scanner the Scanner object for input
     * @param prompt the prompt message
     * @return a non-empty string
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * String name = getNonEmptyString(scanner, "Enter your name:");
     * // Keeps prompting until non-empty string is entered
     */
    public static String getNonEmptyString(Scanner scanner, String prompt) {
        String input;
        
        while (true) {
            System.out.print(prompt + " ");
            input = scanner.nextLine().trim(); // Remove leading/trailing spaces
            
            if (!input.isEmpty()) {
                return input; // Valid input
            } else {
                System.out.println("Error: Input cannot be empty. Please try again.");
            }
        }
    }

    /**
     * Validates that input is a valid double.
     * 
     * @param scanner the Scanner object for input
     * @param prompt the prompt message
     * @return a valid double value
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * double value = getValidDouble(scanner, "Enter a decimal number:");
     * // Keeps prompting until valid double is entered
     */
    public static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        
        while (true) {
            System.out.print(prompt + " ");
            
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                return value; // Valid input
            } else {
                System.out.println("Error: Invalid input. Please enter a decimal number.");
                scanner.next(); // Consume invalid input
            }
        }
    }

    /**
     * Validates that input is a valid integer with error handling.
     * 
     * @param scanner the Scanner object for input
     * @param prompt the prompt message
     * @return a valid integer
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * int value = getValidInteger(scanner, "Enter an integer:");
     * // Handles non-integer input gracefully
     */
    public static int getValidInteger(Scanner scanner, String prompt) {
        int value;
        
        while (true) {
            System.out.print(prompt + " ");
            
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                return value; // Valid input
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input to prevent infinite loop
            }
        }
    }
}

