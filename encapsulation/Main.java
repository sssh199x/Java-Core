package encapsulation;

public class Main {

    public static void main(String[] args) {
        PlayerWithoutEncapsulation playerWithoutEncapsulation = new PlayerWithoutEncapsulation();
        playerWithoutEncapsulation.name = "Tim";
        playerWithoutEncapsulation.health = 20;
        playerWithoutEncapsulation.weapon = "Sword";
        int damage = 10;
        playerWithoutEncapsulation.loseHealth(damage);
        System.out.println("Remaining health: " + playerWithoutEncapsulation.healthRemaining());
        // this is risky as you can set health to invalid values.
        playerWithoutEncapsulation.health = 200;
        playerWithoutEncapsulation.loseHealth(11);
        System.out.println("Remaining health: " + playerWithoutEncapsulation.healthRemaining());
    }
}
