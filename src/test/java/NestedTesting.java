import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

//allows you to group related tests inside nested classes.
public class NestedTesting {
    @Nested
    class CreateUserTests {

        @Test
        void shouldCreateUser() {
            Assertions.assertTrue(true);
        }
    }

    @Nested
    class DeleteUserTests {

        @Test
        void shouldDeleteUser() {
            Assertions.assertTrue(true);
        }
    }
}
