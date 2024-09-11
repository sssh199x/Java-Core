package method_overloading;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 20);
        System.out.println(sum);

        int numList[] = new int[5];
        numList[0] = 10;
        numList[1] = 20;
        numList[2] = 30;
        numList[3] = 40;
        numList[4] = 50;

        // double sum1 = calculator.add(10.6, 20.6, 30.6);
        // System.out.println(sum1);
    }

}

class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}

// Method overloading in Java is a feature that allows a class to have more than
// one method with the same name, but with different parameter lists. It is a
// way to achieve polymorphism in Java.

// Key points about method overloading:

// Different Parameter Lists: Methods must differ in the number or type of
// parameters.
// Same Method Name: All overloaded methods must have the same name.
// Return Type: The return type can be different, but it alone is not sufficient
// to distinguish overloaded methods.
// Compile-Time Polymorphism: Method overloading is resolved during compile
// time.
// In the provided Calculator class, the add method is overloaded with different
// parameter lists:

// add(int num1, int num2)
// add(int num1, int num2, int num3)
// add(double num1, double num2)
// add(double num1, double num2, double num3)

// In Java, method overloading is determined by the method's name and its
// parameter list (number and type of parameters). The return type alone cannot
// be used to distinguish overloaded methods. This means you cannot have two
// methods in the same class with the same name and parameter list but different
// return types.

// For example, the following would cause a compilation error:
/*
 * public class Example {
 * public int add(int num1, int num2) {
 * return num1 + num2;
 * }
 * 
 * // This will cause a compilation error
 * public double add(int num1, int num2) {
 * return num1 + num2;
 * }
 * }
 * 
 */

// The compiler cannot distinguish between these two add methods based solely on
// their return types. The parameter list must be different for method
// overloading to work.
