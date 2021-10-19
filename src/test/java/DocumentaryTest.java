import company.Documentary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentaryTest {
    @Test
    public void testDocumentarygetTitle() {
        Documentary testDocumentary = new Documentary ("The Social Dillemma","Documentary");
        assertEquals("The Social Dillemma",testDocumentary.getTitle());
    }

    @Test
    public void testDocumentarygetGenre() {
        Documentary testDocumentary = new Documentary ("The Social Dillemma","Documentary");
        assertEquals("Documentary",testDocumentary.getGenre());
    }
}