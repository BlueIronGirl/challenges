package de.alice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GrundrechenartenTest {
    @ParameterizedTest
    @CsvSource({"6,7,0", "3,4,6", "5,5,5"})
    public void calc(int number1, int number2, int expectedValue) {
        int result = Grundrechenarten.calc(number1, number2);
        Assertions.assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @CsvSource({"3,1,2", "8,4,19", "15,8,63"})
    public void calcSumAndCountAllNumbersDivBy_2_Or_7(int number, long expectedValue1, long expectedValue2) {
        long[] result = Grundrechenarten.calcSumAndCountAllNumbersDivBy_2_Or_7(number);
        Assertions.assertEquals(expectedValue1, result[0]);
        Assertions.assertEquals(expectedValue2, result[1]);
    }

    @ParameterizedTest
    @CsvSource({"0,true", "1,false", "2,true", "11,false", "12,true"})
    public void isEven(int number, boolean expectedValue) {
        boolean result = Grundrechenarten.isEven(number);
        Assertions.assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @CsvSource({"0,false", "1,true", "2,false", "11,true", "12,false"})
    public void isOdd(int number, boolean expectedValue) {
        boolean result = Grundrechenarten.isOdd(number);
        Assertions.assertEquals(expectedValue, result);
    }
}