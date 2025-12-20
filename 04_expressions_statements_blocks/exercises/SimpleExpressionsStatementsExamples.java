package expressions_statements_blocks.exercises;

/**
 * Simple Examples of Expressions, Statements, and Code Blocks
 * Working code examples demonstrating these fundamental concepts.
 */
public class SimpleExpressionsStatementsExamples {
    
    public static void main(String[] args) {
        // Example 1: Various expressions
        System.out.println("=== Example 1: Expressions ===");
        int a = 10, b = 5;
        
        // Arithmetic expressions
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        
        // Boolean expressions
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        
        // Ternary expression
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);
        
        // Example 2: Different types of statements
        System.out.println("\n=== Example 2: Statements ===");
        
        // Declaration statement
        int number = 42;
        
        // Assignment statement
        number = 100;
        
        // Expression statement
        number++;
        System.out.println("Number: " + number);
        
        // Control flow statement
        if (number > 50) {
            System.out.println("Number is greater than 50");
        }
        
        // Example 3: Code blocks and scope
        System.out.println("\n=== Example 3: Code Blocks ===");
        
        int outer = 10;
        System.out.println("Outer variable: " + outer);
        
        {
            int inner = 20;
            System.out.println("Inner variable: " + inner);
            System.out.println("Can access outer: " + outer);
        }
        
        // Example 4: Loop statements with blocks
        System.out.println("\n=== Example 4: Loop Blocks ===");
        
        for (int i = 0; i < 3; i++) {
            int loopVar = i * 2;
            System.out.println("i = " + i + ", loopVar = " + loopVar);
        }
        
        // Example 5: Nested blocks
        System.out.println("\n=== Example 5: Nested Blocks ===");
        
        {
            int level1 = 1;
            System.out.println("Level 1: " + level1);
            
            {
                int level2 = 2;
                System.out.println("Level 2: " + level2);
                System.out.println("Can access level1: " + level1);
            }
        }
    }
}

