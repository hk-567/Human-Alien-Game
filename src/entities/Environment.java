package entities;

import java.util.ArrayList;

public class Environment {
    private ArrayList<Entity> entities;

    public Environment() {
        this.entities = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void entityAttack(Entity attacker, Entity target) {
        if (entities.contains(attacker) && entities.contains(target)) {
            attacker.attack(target);
        }
    }
}
