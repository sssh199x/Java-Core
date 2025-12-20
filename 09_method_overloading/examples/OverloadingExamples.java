package method_overloading.examples;

/**
 * More Examples of Method Overloading
 * Demonstrates various scenarios of method overloading.
 */
public class OverloadingExamples {
    
    // Overloading by number of parameters
    public void print() {
        System.out.println("No parameters");
    }
    
    public void print(int num) {
        System.out.println("Integer: " + num);
    }
    
    public void print(int num1, int num2) {
        System.out.println("Two integers: " + num1 + ", " + num2);
    }
    
    // Overloading by type of parameters
    public void print(double num) {
        System.out.println("Double: " + num);
    }
    
    public void print(String text) {
        System.out.println("String: " + text);
    }
    
    // Overloading with different parameter order
    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
    
    // Overloading with arrays
    public void process(int[] numbers) {
        System.out.println("Processing integer array");
    }
    
    public void process(String[] words) {
        System.out.println("Processing string array");
    }
    
    public static void main(String[] args) {
        OverloadingExamples obj = new OverloadingExamples();
        
        // Different number of parameters
        obj.print();
        obj.print(10);
        obj.print(10, 20);
        
        // Different types
        obj.print(3.14);
        obj.print("Hello");
        
        // Different parameter order
        obj.display("Alice", 25);
        obj.display(30, "Bob");
        
        // Different array types
        int[] nums = {1, 2, 3};
        String[] words = {"hello", "world"};
        obj.process(nums);
        obj.process(words);
    }
}

