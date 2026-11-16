import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


 class Test1 {
    public void test(Integer s) throws IllegalArgumentException{
        System.out.println("test-->" + s);
        throw new IllegalArgumentException("age must not be negative");
    }
}


public class ExceptionTest {
    @Test
    void rejectsNegativeAge() {
        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> new Test1().test(5)
        );

        System.out.println("error msg -->" + error.getMessage());
        assertEquals("age must not be negative", error.getMessage());
    }

    @Test
    @DisplayName("success")
    void success() {
        Assertions.assertEquals("test", "test", () -> "Unexpected result for input");
    }

    @Test
    @DisplayName("fail")
    void fail() {
        Assertions.assertEquals("test", "test1", () -> "Unexpected result for input");
    }
}
