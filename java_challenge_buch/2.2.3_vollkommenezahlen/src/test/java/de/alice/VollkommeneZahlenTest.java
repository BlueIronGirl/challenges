package de.alice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

class VollkommeneZahlenTest {
    @ParameterizedTest
    @CsvSource({"1000,'6,28,496'", "10000,'6,28,496,8128'"})
    public void calcPerfectNumbers(int number, String expectedValuesAsString) {
        int[] expectedValue = Arrays.stream(expectedValuesAsString.split(",")).mapToInt(Integer::valueOf).toArray();

        List<Integer> result = VollkommeneZahlen.calcPerfectNumbers(number);
        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();

        Assertions.assertArrayEquals(expectedValue, resultArray);
    }

    @ParameterizedTest
    @CsvSource({"10,'1,2,5'", "30, '1,2,3,5,6,10,15'"})
    public void findProperDivisors(int number, String expectedValuesAsString) {
        int[] expectedValue = Arrays.stream(expectedValuesAsString.split(",")).mapToInt(Integer::valueOf).toArray();

        List<Integer> result = VollkommeneZahlen.findProperDivisors(number);
        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();

        Assertions.assertArrayEquals(expectedValue, resultArray);
    }
}