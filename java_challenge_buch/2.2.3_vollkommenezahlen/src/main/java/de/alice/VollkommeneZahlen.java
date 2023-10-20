package de.alice;

import java.util.ArrayList;
import java.util.List;

public class VollkommeneZahlen {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Vollkommene Zahl berechnen (Natuerliche Zahl deren Wert gleich der Summe ihrer echten Teiler ist)
     *
     * @param number number
     * @return Vollkommene Zahlen
     */
    public static List<Integer> calcPerfectNumbers(int number) {
        final List<Integer> result = new ArrayList<>();

        for (int currentNumber = 1; currentNumber < number; currentNumber++) {
            final List<Integer> divisors = findProperDivisors(currentNumber);
            final int summe = divisors.stream().mapToInt(Integer::intValue).sum();
            if (summe == currentNumber) {
                result.add(currentNumber);
            }
        }

        return result;
    }

    /**
     * Alle echten Teiler der Zahl
     *
     * @param value value
     * @return alle echten Teiler
     */
    public static List<Integer> findProperDivisors(final int value) {
        final List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }
}