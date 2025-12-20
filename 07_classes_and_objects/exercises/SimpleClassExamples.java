package classes_and_objects.exercises;

/**
 * Simple Class Examples
 * Working code examples demonstrating classes and objects.
 */
public class SimpleClassExamples {
    
    // Example 1: Student class
    static class Student {
        String name;
        int rollNumber;
        double grade;
        
        void displayInfo() {
            System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
        }
        
        double calculateGPA() {
            return grade / 10.0;  // Simple GPA calculation
        }
    }
    
    // Example 2: BankAccount class
    static class BankAccount {
        String accountNumber;
        double balance;
        
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        }
        
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
        
        double getBalance() {
            return balance;
        }
    }
    
    // Example 3: Car class
    static class Car {
        String brand;
        String model;
        int year;
        int speed;
        
        void start() {
            System.out.println(brand + " " + model + " started!");
        }
        
        void accelerate(int increment) {
            speed += increment;
            System.out.println("Speed increased to: " + speed + " km/h");
        }
        
        void brake(int decrement) {
            speed -= decrement;
            if (speed < 0) speed = 0;
            System.out.println("Speed decreased to: " + speed + " km/h");
        }
        
        void stop() {
            speed = 0;
            System.out.println(brand + " " + model + " stopped!");
        }
    }
    
    public static void main(String[] args) {
        // Example 1: Student
        System.out.println("=== Example 1: Student Class ===");
        Student student = new Student();
        student.name = "Alice";
        student.rollNumber = 101;
        student.grade = 85.5;
        student.displayInfo();
        System.out.println("GPA: " + student.calculateGPA());
        
        // Example 2: BankAccount
        System.out.println("\n=== Example 2: BankAccount Class ===");
        BankAccount account = new BankAccount();
        account.accountNumber = "ACC001";
        account.balance = 1000.0;
        System.out.println("Initial balance: " + account.getBalance());
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0);  // Should fail
        
        // Example 3: Car
        System.out.println("\n=== Example 3: Car Class ===");
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2023;
        car.start();
        car.accelerate(30);
        car.accelerate(20);
        car.brake(10);
        car.stop();
    }
}

