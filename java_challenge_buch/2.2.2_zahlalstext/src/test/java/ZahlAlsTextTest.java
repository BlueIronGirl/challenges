import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ZahlAlsTextTest {
    private static Stream<Arguments> numberAsTextTestProvider() {
        return Stream.of(
                Arguments.of(1, "ONE"),
                Arguments.of(2, "TWO"),
                Arguments.of(21, "TWO ONE"),
                Arguments.of(123, "ONE TWO THREE")
        );
    }

    @ParameterizedTest
    @MethodSource("numberAsTextTestProvider")
    public void numberAsTextRekursiv(int number, String expectedValue) {
        String result = ZahlAlsText.numberAsTextRekursiv(number);
        Assertions.assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @MethodSource("numberAsTextTestProvider")
    public void numberAsTextIterativ(int number, String expectedValue) {
        String result = ZahlAlsText.numberAsTextIterativ(number);
        Assertions.assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @CsvSource({"1, ONE", "2, TWO", "3, THREE", "4, FOUR", "5, FIVE", "6, SIX",
            "7, SEVEN", "8, EIGHT", "9, NINE", "0, ZERO", "-1, ZERO"})
    public void digitAsText(int number, String expectedValue) {
        String result = ZahlAlsText.digitAsText(number);
        Assertions.assertEquals(expectedValue, result);
    }
}
