package encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int healthPercentage, String weapon) {
        this.fullName = name;
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
        this.weapon = weapon;

    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public void restoreHealth(int extraHealth) {
        this.healthPercentage += extraHealth;
        if(this.healthPercentage > 100) {
            System.out.println("Player restored to 100% health");
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }
}
