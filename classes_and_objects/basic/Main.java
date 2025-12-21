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


        BankAccount bobsBankAccount = new BankAccount();
        bobsBankAccount.setCustomerName("Sandesh Hamal");
        System.out.println("Customer Name: " + bobsBankAccount.getCustomerName());
        bobsBankAccount.setAccountNumber("123456");
        System.out.println("Account Number: " + bobsBankAccount.getAccountNumber());
        bobsBankAccount.setEmail("sandeshhamal5890@gmail.com");
        System.out.println("Email: " + bobsBankAccount.getEmail());
        bobsBankAccount.setPhoneNumber("+977 9815141345");
        System.out.println("Phone Number: " + bobsBankAccount.getPhoneNumber());
        bobsBankAccount.deposit(BigDecimal.valueOf(1000));
        bobsBankAccount.withdraw(BigDecimal.valueOf(500));
    }
}