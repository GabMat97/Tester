import company.Audiobook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudiobookTest {
    @Test
    public void testAudiobook() {
        Audiobook testAudiobook = new Audiobook ("Audible","Audiobook");
        assertEquals("Audible",testAudiobook.getTitle());
    }
}