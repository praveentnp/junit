import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
public class AssertAllTest {

    @Test
    void assertAllTest() {
        assertAll(
                () -> Assertions.assertEquals("Praveen", "Praveen")
                , () -> Assertions.assertEquals("Sound", "Sound")
                , () ->Assertions.assertEquals("Fail", "Praveen1")
        );
    }
}
