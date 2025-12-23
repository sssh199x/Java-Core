package constructors.exercises;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;


    public Customer() {
        this("Default Name", 1000.0, "Default Email");
        System.out.println("Default constructor called");
    }


    public Customer(String name, String  email) {
        this(name,0, email);
        System.out.println("Partial parameterized constructor called");
    }


    public Customer(String name, double creditLimit, String email) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
