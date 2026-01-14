package encapsulation;

public class Main {

    public static void main(String[] args) {
       /** PlayerWithoutEncapsulation playerWithoutEncapsulation = new PlayerWithoutEncapsulation();
        playerWithoutEncapsulation.name = "Tim";
        playerWithoutEncapsulation.health = 20;
        playerWithoutEncapsulation.weapon = "Sword";
        int damage = 10;
        playerWithoutEncapsulation.loseHealth(damage);
        System.out.println("Remaining health: " + playerWithoutEncapsulation.healthRemaining());
        // this is risky as you can set health to invalid values.
        // we may have to change the calling code in many places if we change the member variable name
        // we may have to initialize the player class member variables in many places without a constructor
        playerWithoutEncapsulation.health = 200;
        playerWithoutEncapsulation.loseHealth(11);
        System.out.println("Remaining health: " + playerWithoutEncapsulation.healthRemaining());
        */

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim");
        System.out.println("Initial health is " + enhancedPlayer.healthRemaining());
        EnhancedPlayer enhancedPlayer2 = new EnhancedPlayer("Tim",200,"Axe");
        // even though we passed invalid health value, the constructor handled it
        // there's no way for the calling code to change the health directly,except to call enhanced player's methods to do it.
        // this gives all the control to the EnhancedPlayer class to manage its state
        // just to be clear this is encapsulation
        // i am doing this by making my fields private and providing public methods to access them
        System.out.println("Initial health is " + enhancedPlayer2.healthRemaining());
    }
}
