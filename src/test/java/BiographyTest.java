import company.Biography;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiographyTest {
    @Test
    public void testBiography() {
        Biography testBiography = new Biography ("Mein Kampf","Biography");
        assertEquals("Mein Kampf",testBiography.getTitle());
    }
}