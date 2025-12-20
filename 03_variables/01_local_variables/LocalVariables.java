package variables.local;

/**
 * Learning about Local Variables
 * Local variables are declared inside methods, constructors, or blocks.
 */
public class LocalVariables {
    public static void main(String[] args) {
        // Local variable declared inside main method
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        
        // Local variable in a block
        {
            int blockVariable = 50;
            System.out.println("Block variable: " + blockVariable);
        }
        // blockVariable is not accessible here - out of scope
        
        // Local variable in a loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop variable i: " + i);
        }
        // i is not accessible here - out of scope
    }
    
    public static void anotherMethod() {
        // Different method, different scope
        int localVar = 100;
        System.out.println("Local variable in anotherMethod: " + localVar);
    }
}

