import company.Fantasy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FantasyTest {
    @Test
    public void testFantasygetTitle() {
        Fantasy testFantasy = new Fantasy ("Lord of the Rings","Fantasy");
        assertEquals("Lord of the Rings",testFantasy.getTitle());
    }

    @Test
    public void testFantasygetGenre() {
        Fantasy testFantasy = new Fantasy ("Lord of the Rings","Fantasy");
        assertEquals("Fantasy",testFantasy.getGenre());
    }
}