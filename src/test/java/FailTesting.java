import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FailTesting {

    @Test
    void shouldFailWhenUnexpectedExceptionOccurs() {

        try {
            processPayment();
            //fail("Expected exception was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid payment", e.getMessage());
        }
    }

    void processPayment() {
        System.out.println("Inside process payment ");
    }
}
