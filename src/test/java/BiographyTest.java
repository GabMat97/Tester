import company.Biography;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiographyTest {
    @Test
    public void testBiographygetTitle() {
        Biography testBiography = new Biography ("Mein Kampf","Biography");
        assertEquals("Mein Kampf",testBiography.getTitle());
    }

    @Test
    public void testBiographygetGenre() {
        Biography testBiography = new Biography ("Mein Kampf","Biography");
        assertEquals("Biography",testBiography.getGenre());
    }
}