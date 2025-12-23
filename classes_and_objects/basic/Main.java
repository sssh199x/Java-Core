package classes_and_objects.basic;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
         Car car = new Car();
        car.setMake("Porsche");;
        car.setModel("Carrera");
        car.setColor("Blue");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Doors: " + car.getDoors());
        System.out.println("Is Convertible: " + car.isConvertible());
        car.describeCar();

        System.out.println("--------------------------------------------");

        BankAccount defaultBankAccount = new BankAccount();
        System.out.println("Default constructor called");
        System.out.println("Customer Name: " + defaultBankAccount.getCustomerName());
        System.out.println("Account Number: " + defaultBankAccount.getAccountNumber());
        System.out.println("Email: " + defaultBankAccount.getEmail());
        System.out.println("Phone Number: " + defaultBankAccount.getPhoneNumber());
        System.out.println("Balance: " + defaultBankAccount.getBalance());

        System.out.println("--------------------------------------------");


        BankAccount bobsBankAccount = new BankAccount("123456", "Bob Brown","sandeshhamal5890@gmail.com", "+977 9815141345", BigDecimal.valueOf(0));
        System.out.println("Customer Name: " + bobsBankAccount.getCustomerName());
        System.out.println("Account Number: " + bobsBankAccount.getAccountNumber());
        System.out.println("Email: " + bobsBankAccount.getEmail());
        System.out.println("Phone Number: " + bobsBankAccount.getPhoneNumber());
        bobsBankAccount.deposit(BigDecimal.valueOf(1000));
        bobsBankAccount.withdraw(BigDecimal.valueOf(500));

        System.out.println("--------------------------------------------");
        BankAccount timsAccount = new BankAccount("Tim Smith", "timsmith@gmail.com","+977 9800000000");
        System.out.println("Customer Name: " + timsAccount.getCustomerName());
        System.out.println("Email: " + timsAccount.getEmail());
        System.out.println("Phone Number: " + timsAccount.getPhoneNumber());
    }
}