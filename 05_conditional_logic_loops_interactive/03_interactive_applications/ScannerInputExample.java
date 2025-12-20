package conditional_logic_loops_interactive.interactive_applications;

import java.util.Scanner;

/**
 * Scanner Input Examples
 * 
 * This class demonstrates:
 * 1. Creating Scanner objects
 * 2. Reading different data types (int, double, String)
 * 3. Reading multiple inputs
 * 4. Handling input properly
 * 5. Scanner best practices
 * 
 * Note: This class contains methods that demonstrate Scanner usage.
 * In a real application, you would create a Scanner in main() and pass it to methods,
 * or create it within the method. For demonstration, methods accept Scanner as parameter.
 */
public class ScannerInputExample {

    /**
     * Reads an integer from the user using Scanner.
     * 
     * @param scanner the Scanner object for input
     * @return the integer value entered by user
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * int number = readInteger(scanner); // User enters: 42
     * // Returns: 42
     */
    public static int readInteger(Scanner scanner) {
        System.out.print("Enter an integer: ");
        // nextInt() reads the next integer from input
        int value = scanner.nextInt();
        return value;
    }

    /**
     * Reads a double from the user using Scanner.
     * 
     * @param scanner the Scanner object for input
     * @return the double value entered by user
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * double number = readDouble(scanner); // User enters: 3.14
     * // Returns: 3.14
     */
    public static double readDouble(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        // nextDouble() reads the next double from input
        double value = scanner.nextDouble();
        return value;
    }

    /**
     * Reads a String from the user using Scanner.
     * 
     * Note: next() reads only one word (until whitespace).
     * Use nextLine() to read an entire line.
     * 
     * @param scanner the Scanner object for input
     * @return the String value entered by user
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * String name = readString(scanner); // User enters: Java
     * // Returns: "Java"
     */
    public static String readString(Scanner scanner) {
        System.out.print("Enter a string: ");
        // next() reads until whitespace
        String value = scanner.next();
        return value;
    }

    /**
     * Reads an entire line from the user using Scanner.
     * 
     * @param scanner the Scanner object for input
     * @return the entire line entered by user
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * String line = readLine(scanner); // User enters: Hello World
     * // Returns: "Hello World"
     */
    public static String readLine(Scanner scanner) {
        System.out.print("Enter a line: ");
        // nextLine() reads the entire line including spaces
        // Note: If previous input was nextInt() or nextDouble(), 
        // you may need to consume the newline first
        String value = scanner.nextLine();
        return value;
    }

    /**
     * Reads multiple values from the user.
     * 
     * @param scanner the Scanner object for input
     * @return an array containing [name, age, salary]
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * Object[] data = readMultipleInputs(scanner);
     * // User enters: John, 25, 50000.50
     */
    public static Object[] readMultipleInputs(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        
        return new Object[]{name, age, salary};
    }

    /**
     * Reads a character from the user.
     * 
     * Note: Scanner doesn't have nextChar(), so we read a String and take first character.
     * 
     * @param scanner the Scanner object for input
     * @return the first character entered by user
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * char ch = readCharacter(scanner); // User enters: A
     * // Returns: 'A'
     */
    public static char readCharacter(Scanner scanner) {
        System.out.print("Enter a character: ");
        // Read string and get first character
        String input = scanner.next();
        return input.charAt(0);
    }

    /**
     * Demonstrates proper Scanner usage with nextInt() followed by nextLine().
     * 
     * Important: After nextInt() or nextDouble(), the newline character remains.
     * You need to consume it before calling nextLine().
     * 
     * @param scanner the Scanner object for input
     * @return an array with [number, text]
     */
    public static Object[] readIntThenString(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Consume the leftover newline
        scanner.nextLine();
        
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        
        return new Object[]{number, text};
    }
}

