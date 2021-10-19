import company.Children_book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Children_bookTest {
    @Test
    public void testChildren_bookgetTitle() {
        Children_book testChildren_book = new Children_book ("The Gruffalo","Children_book");
        assertEquals("The Gruffalo",testChildren_book.getTitle());
    }

    @Test
    public void testChildren_bookgetGenre() {
        Children_book testChildren_book = new Children_book ("The Gruffalo","Children_book");
        assertEquals("Children_book",testChildren_book.getGenre());
    }
}