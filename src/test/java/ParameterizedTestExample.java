import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void recognizesEvenNumbers(int number) {
        Assertions.assertTrue(() -> number%2 == 0);
    }

    @ParameterizedTest
    @ValueSources({@ValueSource(strings = {"", " ", "\t"}), @ValueSource(ints = {2})})
    void recognizesBlankStrings(String input) {
        Assertions.assertTrue(input.isBlank());
    }

    @ParameterizedTest
    @CsvSource({
            "2, 4",
            "3, 9",
            "4, 16"
    })
    void squaresNumber(int input, int expected) {
        assertEquals(expected, input*input);
    }

    @ParameterizedTest
    @CsvFileSource(
            resources = "csv/test-data.csv",
            numLinesToSkip = 0
    )
    void shouldAddNumbers(
            int a, int b, int expected) {

        assertEquals(expected, a + b);
    }

    @ParameterizedTest
    @MethodSource("provideNumbers") //When test data is complex and cannot easily be represented using simple strings or primitive values.
    void shouldAddNumbersByProvideNumbers(
            int a, int b, int expected) {

        assertEquals(expected, a + b);
    }

    static Stream<Arguments> provideNumbers() {

        return Stream.of(
                Arguments.of(10, 20, 30),
                Arguments.of(5, 5, 10),
                Arguments.of(2, 3, 5)
        );
    }
}
