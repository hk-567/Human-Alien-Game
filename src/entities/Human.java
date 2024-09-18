package entities;

public class Human extends Entity {
    private int armor;

    public Human(String name, int health, int attackPower, int armor) {
        super(name, health, attackPower);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = Math.max(0, damage - armor); // Armor reduces damage
        super.takeDamage(reducedDamage);
    }
}
