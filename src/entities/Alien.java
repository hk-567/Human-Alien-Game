package entities;

public class Alien extends Entity {
    private int regenerationRate;

    public Alien(String name, int health, int attackPower, int regenerationRate) {
        super(name, health, attackPower);
        this.regenerationRate = regenerationRate;
    }

    public int getRegenerationRate() {
        return regenerationRate;
    }

    public void regenerate() {
        this.health += regenerationRate;
    }
}
