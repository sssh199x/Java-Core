package expressions_statements_blocks.statements;

/**
 * Learning about Statements in Java
 * A statement is a complete unit of execution that performs an action.
 */
public class StatementsExample {
    public static void main(String[] args) {
        // Declaration statements
        System.out.println("=== Declaration Statements ===");
        int number;           // Declaration statement
        String name;          // Declaration statement
        double price = 19.99; // Declaration with initialization
        
        // Expression statements
        System.out.println("\n=== Expression Statements ===");
        int a = 10;
        int b = 20;
        int sum = a + b;      // Expression statement
        a++;                  // Expression statement (increment)
        b--;                  // Expression statement (decrement)
        System.out.println("Sum: " + sum);  // Expression statement (method call)
        
        // Assignment statements
        System.out.println("\n=== Assignment Statements ===");
        int x = 10;           // Assignment statement
        x = 20;               // Assignment statement
        x += 5;                // Compound assignment statement
        x -= 3;                // Compound assignment statement
        System.out.println("x = " + x);
        
        // Control flow statements - if
        System.out.println("\n=== If Statements ===");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
        
        // Control flow statements - switch
        System.out.println("\n=== Switch Statements ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
        
        // Control flow statements - for loop
        System.out.println("\n=== For Loop Statements ===");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Control flow statements - while loop
        System.out.println("\n=== While Loop Statements ===");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Control flow statements - do-while loop
        System.out.println("\n=== Do-While Loop Statements ===");
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 3);
        
        // Jump statements - return
        System.out.println("\n=== Return Statement ===");
        int result = calculateSum(10, 20);
        System.out.println("Result: " + result);
        
        // Jump statements - break
        System.out.println("\n=== Break Statement ===");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Exit loop
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Jump statements - continue
        System.out.println("\n=== Continue Statement ===");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // Skip this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Method with return statement
    static int calculateSum(int a, int b) {
        return a + b;  // Return statement
    }
}

