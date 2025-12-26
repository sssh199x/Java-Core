package inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demo ===");
        Animal animal = new Animal("Generic Animal", "Huge", 400.0);
        doAnimalStuff(animal, "slow");


        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________________________________________");
    }
}
