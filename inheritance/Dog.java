package inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt", "Big", 50.0);
    }


    public void bark() {
        System.out.println("Woof Woof");
    }

    public void run() {
        System.out.println("Run");
    }

    public void walk() {
        System.out.println("Walk");
    }

    public void wagTail() {
        System.out.println("Wag Tail");
    }
}
