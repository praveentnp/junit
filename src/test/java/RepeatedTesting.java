import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.UUID;

public class RepeatedTesting {
    @RepeatedTest(5)
    void shouldGenerateUniqueId() {
        Assertions.assertNotNull(UUID.randomUUID());
    }
}
