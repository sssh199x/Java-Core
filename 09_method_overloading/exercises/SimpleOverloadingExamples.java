package method_overloading.exercises;

/**
 * Simple Method Overloading Examples
 * Working code examples demonstrating method overloading.
 */
public class SimpleOverloadingExamples {
    
    // Example 1: MathUtils class
    static class MathUtils {
        // Add two integers
        int add(int a, int b) {
            return a + b;
        }
        
        // Add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }
        
        // Add two doubles
        double add(double a, double b) {
            return a + b;
        }
        
        // Add array of integers
        int add(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }
    }
    
    // Example 2: Printer class
    static class Printer {
        void print(String text) {
            System.out.println("String: " + text);
        }
        
        void print(int number) {
            System.out.println("Integer: " + number);
        }
        
        void print(double number) {
            System.out.println("Double: " + number);
        }
        
        void print(boolean value) {
            System.out.println("Boolean: " + value);
        }
    }
    
    // Example 3: Calculator class
    static class Calculator {
        // Addition
        int calculate(int a, int b) {
            return a + b;
        }
        
        // Subtraction
        int calculate(int a, int b, String operation) {
            if (operation.equals("subtract")) {
                return a - b;
            }
            return 0;
        }
        
        // Multiplication (doubles)
        double calculate(double a, double b) {
            return a * b;
        }
        
        // Division (doubles)
        double calculate(double a, double b, String operation) {
            if (operation.equals("divide")) {
                return a / b;
            }
            return 0;
        }
    }
    
    public static void main(String[] args) {
        // Example 1: MathUtils
        System.out.println("=== Example 1: MathUtils Class ===");
        MathUtils math = new MathUtils();
        System.out.println("add(10, 20): " + math.add(10, 20));
        System.out.println("add(10, 20, 30): " + math.add(10, 20, 30));
        System.out.println("add(10.5, 20.5): " + math.add(10.5, 20.5));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("add([1,2,3,4,5]): " + math.add(numbers));
        
        // Example 2: Printer
        System.out.println("\n=== Example 2: Printer Class ===");
        Printer printer = new Printer();
        printer.print("Hello World");
        printer.print(42);
        printer.print(3.14);
        printer.print(true);
        
        // Example 3: Calculator
        System.out.println("\n=== Example 3: Calculator Class ===");
        Calculator calc = new Calculator();
        System.out.println("calculate(10, 5): " + calc.calculate(10, 5));
        System.out.println("calculate(10, 5, 'subtract'): " + calc.calculate(10, 5, "subtract"));
        System.out.println("calculate(10.5, 2.0): " + calc.calculate(10.5, 2.0));
        System.out.println("calculate(10.0, 2.0, 'divide'): " + calc.calculate(10.0, 2.0, "divide"));
    }
}

