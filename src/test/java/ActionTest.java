import company.Action;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ActionTest {
    @Test
    public void testActiongetTitle() {
        Action testAction = new Action ("Die Hard","Action");
        assertEquals("Die Hard",testAction.getTitle());
    }

    @Test
    public void testActiongetGenre() {
        Action testAction = new Action ("Die Hard","Action");
        assertEquals("Action",testAction.getGenre());
    }
}