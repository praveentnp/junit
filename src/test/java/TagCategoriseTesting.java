import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//categorises tests so they can be selectively executed. Like, unit, integration, smoke, regression
public class TagCategoriseTesting {
    @Test
    @Tag("smoke")
    void loginTest() {
        Assertions.assertTrue(true);
    }
}
