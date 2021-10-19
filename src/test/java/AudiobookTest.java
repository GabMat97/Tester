import company.Audiobook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudiobookTest {
    @Test
    public void testAudiobookgetTitle() {
        Audiobook testAudiobook = new Audiobook ("Audible","Audiobook");
        assertEquals("Audible",testAudiobook.getTitle());
    }

    @Test
    public void testAudiobookgetGenre() {
        Audiobook testAudiobook = new Audiobook ("Audible","Audiobook");
        assertEquals("Audiobook",testAudiobook.getGenre());
    }
}