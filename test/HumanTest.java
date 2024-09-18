import entities.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;

    @BeforeEach
    void setUp() {
        human = new Human("Warrior", 100, 15, 5);
    }

    @Test
    void testHumanCreation() {
        assertEquals("Warrior", human.getName());
        assertEquals(100, human.getHealth());
        assertEquals(15, human.getAttackPower());
        assertEquals(5, human.getArmor());
    }

    @Test
    void testTakeDamageWithArmor() {
        human.takeDamage(10); // should reduce damage by 5 (armour)
        assertEquals(95, human.getHealth());
    }

    @Test
    void testArmorAbsorbsAllDamage() {
        human.takeDamage(5); // armour should absorb all damage
        assertEquals(100, human.getHealth());
    }
}
