package expressions_statements_blocks.expressions;

/**
 * Learning about Expressions in Java
 * An expression is a combination of variables, operators, and method calls that evaluates to a single value.
 */
public class ExpressionsExample {
    public static void main(String[] args) {
        // Arithmetic expressions
        System.out.println("=== Arithmetic Expressions ===");
        int a = 10;
        int b = 5;
        
        int sum = a + b;           // Expression: a + b
        int difference = a - b;    // Expression: a - b
        int product = a * b;       // Expression: a * b
        int quotient = a / b;      // Expression: a / b
        int remainder = a % b;     // Expression: a % b
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        // Complex expressions
        System.out.println("\n=== Complex Expressions ===");
        int result = (a + b) * 2 - 5;  // Expression with parentheses
        System.out.println("(a + b) * 2 - 5 = " + result);
        
        double average = (a + b) / 2.0;  // Expression with type conversion
        System.out.println("Average: " + average);
        
        // Boolean expressions
        System.out.println("\n=== Boolean Expressions ===");
        boolean isGreater = a > b;        // Expression: a > b
        boolean isEqual = a == b;         // Expression: a == b
        boolean isNotEqual = a != b;      // Expression: a != b
        boolean logicalAnd = (a > 5) && (b < 10);  // Expression: (a > 5) && (b < 10)
        
        System.out.println("a > b: " + isGreater);
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("(a > 5) && (b < 10): " + logicalAnd);
        
        // String expressions
        System.out.println("\n=== String Expressions ===");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;  // Expression: string concatenation
        System.out.println("Full name: " + fullName);
        
        // Method call expressions
        System.out.println("\n=== Method Call Expressions ===");
        int length = fullName.length();  // Expression: method call
        String upper = fullName.toUpperCase();  // Expression: method call
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + upper);
        
        // Assignment expressions
        System.out.println("\n=== Assignment Expressions ===");
        int x = 10;
        x += 5;  // Expression: x = x + 5
        System.out.println("x += 5: " + x);
        
        x *= 2;  // Expression: x = x * 2
        System.out.println("x *= 2: " + x);
        
        // Conditional expressions (ternary operator)
        System.out.println("\n=== Conditional Expressions ===");
        int max = (a > b) ? a : b;  // Expression: ternary operator
        System.out.println("Max of " + a + " and " + b + ": " + max);
        
        String message = (a > b) ? "a is greater" : "b is greater";
        System.out.println(message);
    }
}

