import company.Educational;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EducationalTest {
    @Test
    public void testEducationalgetTitle() {
        Educational testEducational = new Educational ("The Study Skills Handbook","Educational");
        assertEquals("The Study Skills Handbook",testEducational.getTitle());
    }

    @Test
    public void testEducationalgetGenre() {
        Educational testEducational = new Educational ("The Study Skills Handbook","Educational");
        assertEquals("Educational",testEducational.getGenre());
    }
}