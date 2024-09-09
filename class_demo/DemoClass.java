package class_demo;

public class DemoClass {

    // static means that the method belongs to the Demo class and not an object of the Demo class.
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator calculator = new Calculator();
        int sum = calculator.add(num1, num2);
        System.out.println(sum);

    }

}

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
