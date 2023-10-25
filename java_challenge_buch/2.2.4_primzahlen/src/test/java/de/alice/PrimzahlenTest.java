package de.alice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

class PrimzahlenTest {
    @ParameterizedTest
    @CsvSource({"15,'2,3,5,7,11,13'",
            "25,'2,3,5,7,11,13,17,19,23'",
            "50,'2,3,5,7,11,13,17,19,23,29,31,37,41,43,47'"})
    public void calcPrimesUpTo(int number, String expectedValuesAsString) {
        List<Integer> result = Primzahlen.calcPrimesUpTo(number);

        int[] expectedValue = Arrays.stream(expectedValuesAsString.split(",")).mapToInt(Integer::valueOf).toArray();
        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();
        Assertions.assertArrayEquals(expectedValue, resultArray);
    }

    @ParameterizedTest
    @CsvSource({"15,'2,3,5,7,11,13'",
            "25,'2,3,5,7,11,13,17,19,23'",
            "50,'2,3,5,7,11,13,17,19,23,29,31,37,41,43,47'"})
    public void calcPrimesUpToSiebDesEratosthenes(int number, String expectedValuesAsString) {
        List<Integer> result = Primzahlen.calcPrimesUpToSiebDesEratosthenes(number);

        int[] expectedValue = Arrays.stream(expectedValuesAsString.split(",")).mapToInt(Integer::valueOf).toArray();
        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();
        Assertions.assertArrayEquals(expectedValue, resultArray);
    }

    @ParameterizedTest
    @CsvSource({"1,false", "2,true", "3,true", "4,false", "5,true", "6,false", "7,true", "8,false", "9,false", "10,false",
            "11,true", "12,false", "13,true", "14,false", "15,false", "16,false", "17,true", "18,false", "19,true", "20,false",
            "21,false", "22,false", "23,true"})
    public void isPrime(int number, boolean expectedValue) {
        boolean result = Primzahlen.isPrime(number);

        Assertions.assertEquals(expectedValue, result);
    }
}