package classes_and_objects.basic;

/**
 * Learning about Classes and Objects in Java
 * A class is a blueprint for creating objects.
 */
public class DemoClass {
    // static means that the method belongs to the DemoClass class and not an object of the DemoClass class.
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator calculator = new Calculator();
        int sum = calculator.add(num1, num2);
        System.out.println(sum);
    }
}

/**
 * Calculator class demonstrates how to create a class with methods.
 */
class Calculator {
    final int num1;
    final int num2;

    Calculator() {
        this.num1 = 10;
        this.num2 = 20;
        System.out.println("Calculator object created");
    }
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

