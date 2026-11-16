import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Asserts {
    @Test
    void testEquality() {

        String a = new String("Java");
        String b = new String("Java");

        assertEquals(a, b); // Pass
        assertNotSame(a, b); // Pass // check for reference
        // assertSame(a, b); // check for reference
     }

    @Test
    void shouldNotThrowException() {

        assertDoesNotThrow(() -> {
            int result = 10 / 2;
            assertEquals(5, result);
        });
    }

    @Test
    void shouldCompleteWithinTime() {

        assertTimeout(
                Duration.ofSeconds(2),
                () -> {
                    Thread.sleep(500);
                }
        );
    }

    @Test
    void shouldCompareLists() {
        //It compares two iterables for equality of their elements in the same order.

        List<String> expected = List.of("Java", "Spring", "Kafka");
        List<String> actual = List.of("Java", "Spring", "Kafka");
        assertIterableEquals(expected, actual);
    }

    @Test
    void shouldCompareArrays() {
        //It compares the contents of two arrays.
        int[] expected = {10, 20, 30};
        int[] actual = {10, 20, 30};

        assertArrayEquals(expected, actual);
    }



}
