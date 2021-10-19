import company.Self_development;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Self_developmentTest {
    @Test
    public void testSelf_developmentgetTitle() {
        Self_development testSelf_development = new Self_development ("The Power of Now","Self Development");
        assertEquals("The Power of Now",testSelf_development.getTitle());
    }

    @Test
    public void testSelf_developmentgetGenre() {
        Self_development testSelf_development = new Self_development ("The Power of Now","Self Development");
        assertEquals("Self Development",testSelf_development.getGenre());
    }
}