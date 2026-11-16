import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

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


}
