import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class DogTest {
    @Test
    public void testSpeak() {
        Dog dog = new Dog();
        assertEquals("Woof", dog.speak());
    }
}
