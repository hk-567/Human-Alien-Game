import entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnvironmentTest {
    Environment environment;
    Human human;
    Alien alien;

    @BeforeEach
    void setUp() {
        environment = new Environment();
        human = new Human("Warrior", 100, 15, 5);
        alien = new Alien("ET", 80, 12, 10);
        environment.addEntity(human);
        environment.addEntity(alien);
    }

    @Test
    void testAddEntities() {
        assertEquals(2, environment.getEntities().size());
    }

    @Test
    void testEntityAttack() {
        environment.entityAttack(human, alien);
        assertEquals(65, alien.getHealth());
    }
}
