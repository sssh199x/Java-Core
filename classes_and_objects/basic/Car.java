package classes_and_objects.basic;

public class Car {
    private String make = "Tesla";
    private String model = "Model Y";
    private String color = "Red";
    private int doors = 4;
    private boolean isConvertible = true;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) {
            this.make = "Unknown";
            return;
        }
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case  "holden","porsche" ,"tesla"-> this.make = make;
            default -> this.make = "Unsupported";

        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public   void describeCar() {
        System.out.println(doors + "-Door "
        + color + " "
        + make + " " 
        + model + " " 
        + (isConvertible ? "Convertible" : "X"));
    }
}