package constructor;

// Class representing a Human
class Human {
    // Instance variables
    private String name;
    private int age;
    // Static variable
    private static String type;

    // Static block to initialize static variable
    static {
        type = "Mammal";
        System.out.println("Static block called");
    }

    public Human() {
        this.name = "Sandesh";
        this.age = 25;
    }

    // Parameterized Constructor to initialize instance variables
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called");
    }

    // Static method to get the type
    public static String getType() {
        return type;
    }

    // Static method to set the type
    public static void setType(String type) {
        Human.type = type;
    }

    // Method to get the name
    public String getName() {
        return this.name;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the age
    public int getAge() {
        return this.age;
    }

    // Method to set the age
    public void setAge(int age) {
        this.age = age;
    }
}

// Main class to test the Human class
public class demo {
    public static void main(String args[]) {
        // Creating first Human object
        Human human = new Human("John", 25);
        System.out.println("Name: " + human.getName() + " Age: " + human.getAge() + " Type: " + Human.getType());

        // Creating second Human object
        Human human2 = new Human("Doe", 30);
        System.out.println("Name: " + human2.getName() + " Age: " + human2.getAge() + " Type: " + Human.getType());

        // Creating third Human object
        Human human3 = new Human();
        System.out.println("Name: " + human3.getName() + " Age: " + human3.getAge() + " Type: " + Human.getType());
    }
}