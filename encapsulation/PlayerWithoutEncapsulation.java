package encapsulation;

public class PlayerWithoutEncapsulation {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;
        if(this.health > 100) {
            System.out.println("Player restored to 100% health");
            this.health = 100;
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
