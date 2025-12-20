package expressions_statements_blocks.code_blocks;

/**
 * Learning about Code Blocks in Java
 * A code block is a group of zero or more statements enclosed in curly braces {}.
 */
public class CodeBlocksExample {
    // Class-level block (instance variable)
    int classVariable = 10;
    
    // Static block - executed when class is loaded
    static {
        System.out.println("Static block executed - class is being loaded");
    }
    
    // Instance initialization block - executed before constructor
    {
        System.out.println("Instance initialization block executed");
    }
    
    public CodeBlocksExample() {
        System.out.println("Constructor executed");
    }
    
    public static void main(String[] args) {
        // Method block
        System.out.println("=== Method Block ===");
        int methodVariable = 20;
        System.out.println("Method variable: " + methodVariable);
        
        // Simple block
        System.out.println("\n=== Simple Block ===");
        {
            int blockVariable = 30;
            System.out.println("Block variable: " + blockVariable);
            // blockVariable is only accessible within this block
        }
        // System.out.println(blockVariable);  // Error: out of scope
        
        // If statement block
        System.out.println("\n=== If Statement Block ===");
        int x = 10;
        if (x > 5) {
            int ifVariable = 40;
            System.out.println("x is greater than 5");
            System.out.println("ifVariable: " + ifVariable);
        }
        // System.out.println(ifVariable);  // Error: out of scope
        
        // For loop block
        System.out.println("\n=== For Loop Block ===");
        for (int i = 0; i < 3; i++) {
            int loopVariable = i * 10;
            System.out.println("Loop iteration " + i + ", loopVariable: " + loopVariable);
        }
        // System.out.println(i);  // Error: out of scope
        // System.out.println(loopVariable);  // Error: out of scope
        
        // While loop block
        System.out.println("\n=== While Loop Block ===");
        int count = 0;
        while (count < 2) {
            int whileVariable = count * 5;
            System.out.println("Count: " + count + ", whileVariable: " + whileVariable);
            count++;
        }
        
        // Nested blocks
        System.out.println("\n=== Nested Blocks ===");
        {
            int outerBlock = 100;
            System.out.println("Outer block variable: " + outerBlock);
            
            {
                int innerBlock = 200;
                System.out.println("Inner block variable: " + innerBlock);
                System.out.println("Can access outer block: " + outerBlock);
            }
            // System.out.println(innerBlock);  // Error: out of scope
        }
        
        // Try-catch block
        System.out.println("\n=== Try-Catch Block ===");
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Demonstrating instance initialization block
        System.out.println("\n=== Creating New Object ===");
        CodeBlocksExample obj = new CodeBlocksExample();
    }
    
    // Method with block
    public void methodWithBlock() {
        System.out.println("\n=== Method with Block ===");
        int methodVar = 50;
        
        if (methodVar > 0) {
            int blockVar = 60;
            System.out.println("methodVar: " + methodVar);
            System.out.println("blockVar: " + blockVar);
        }
    }
}

