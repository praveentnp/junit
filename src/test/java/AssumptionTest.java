import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.crypto.Mac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionTest {
    @Test
    void usesLinuxSpecificFeature() {

        System.out.println("OS Name -->" + System.getProperty("os.name"));
        // This test applies only when running on Linux.
        assumeTrue(
                System.getProperty("os.name").startsWith("Linux"),
                "Requires Linux"
        );

        // If the assumption passes, the test continues.
        assertEquals("expected", "Mac");
    }

    @Test
    @DisplayName("Failing")
    void failCase() {
        System.out.println("--->Test annotations");
        assertEquals(4, 2 + 8);
    }

    @Test
    @DisplayName("adding numerals")
    void addsNumbers() {
        System.out.println("--->Test annotations");
        assertEquals(4, 2 + 2);
    }
}
