import entities.Alien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {
    Alien alien;

    @BeforeEach
    void setUp() {
        alien = new Alien("ET", 80, 12, 10);
    }

    @Test
    void testAlienCreation() {
        assertEquals("ET", alien.getName());
        assertEquals(80, alien.getHealth());
        assertEquals(12, alien.getAttackPower());
        assertEquals(10, alien.getRegenerationRate());
    }

    @Test
    void testRegeneration() {
        alien.takeDamage(20);
        alien.regenerate(); // Health should increase by regeneration rate
        assertEquals(70, alien.getHealth());
    }
}
