import entities.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {
    Entity entity;

    @BeforeEach
    void setUp() {
        entity = new Entity("Test Entity", 100, 10);
    }

    @Test
    void testEntityCreation() {
        assertEquals("Test Entity", entity.getName());
        assertEquals(100, entity.getHealth());
        assertEquals(10, entity.getAttackPower());
    }

    @Test
    void testTakeDamage() {
        entity.takeDamage(20);
        assertEquals(80, entity.getHealth());
    }

    @Test
    void testAttack() {
        Entity enemy = new Entity("Enemy", 50, 5);
        entity.attack(enemy);
        assertEquals(40, enemy.getHealth());
    }
}
