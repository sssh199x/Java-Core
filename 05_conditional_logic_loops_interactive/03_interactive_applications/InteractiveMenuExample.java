package conditional_logic_loops_interactive.interactive_applications;

import java.util.Scanner;

/**
 * Interactive Menu Examples
 * 
 * This class demonstrates:
 * 1. Creating interactive menus
 * 2. Menu-driven programs
 * 3. User choice handling
 * 4. Menu loops with exit option
 * 5. Clear menu display
 * 
 * Note: Methods accept Scanner as parameter for demonstration.
 */
public class InteractiveMenuExample {

    /**
     * Displays a simple calculator menu and processes user choices.
     * 
     * Menu options:
     * 1. Add
     * 2. Subtract
     * 3. Multiply
     * 4. Divide
     * 5. Exit
     * 
     * @param scanner the Scanner object for input
     * 
     * Examples:
     * Scanner scanner = new Scanner(System.in);
     * showCalculatorMenu(scanner);
     * // Displays menu and processes user choices until exit
     */
    public static void showCalculatorMenu(Scanner scanner) {
        int choice;
        double num1, num2, result;
        
        do {
            // Display menu
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();
            
            // Process choice
            switch (choice) {
                case 1: // Add
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                    
                case 2: // Subtract
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                    
                case 3: // Multiply
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                    
                case 4: // Divide
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                    
                case 5: // Exit
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
                    break;
            }
        } while (choice != 5); // Continue until user chooses exit
    }

    /**
     * Displays a student management menu.
     * 
     * This demonstrates a more complex menu structure with multiple operations.
     * 
     * @param scanner the Scanner object for input
     */
    public static void showStudentMenu(Scanner scanner) {
        int choice;
        String name;
        int age;
        
        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    age = scanner.nextInt();
                    System.out.println("Student added: " + name + ", Age: " + age);
                    break;
                    
                case 2:
                    System.out.println("Viewing all students...");
                    // In a real application, this would display actual student data
                    break;
                    
                case 3:
                    System.out.print("Enter student name to search: ");
                    name = scanner.nextLine();
                    System.out.println("Searching for: " + name);
                    // In a real application, this would search and display results
                    break;
                    
                case 4:
                    System.out.print("Enter student name to delete: ");
                    name = scanner.nextLine();
                    System.out.println("Deleting: " + name);
                    // In a real application, this would delete the student
                    break;
                    
                case 5:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
                    break;
            }
        } while (choice != 5);
    }

    /**
     * Displays a simple text-based menu with validation.
     * 
     * This version includes input validation to ensure valid menu choices.
     * 
     * @param scanner the Scanner object for input
     */
    public static void showValidatedMenu(Scanner scanner) {
        int choice;
        
        do {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Option One");
            System.out.println("2. Option Two");
            System.out.println("3. Option Three");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            // Validate input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                
                if (choice >= 1 && choice <= 4) {
                    // Process valid choice
                    switch (choice) {
                        case 1:
                            System.out.println("You selected Option One");
                            break;
                        case 2:
                            System.out.println("You selected Option Two");
                            break;
                        case 3:
                            System.out.println("You selected Option Three");
                            break;
                        case 4:
                            System.out.println("Exiting... Goodbye!");
                            break;
                    }
                } else {
                    System.out.println("Error: Please enter a number between 1 and 4.");
                    choice = 0; // Set to continue loop
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
                choice = 0; // Set to continue loop
            }
        } while (choice != 4);
    }
}

