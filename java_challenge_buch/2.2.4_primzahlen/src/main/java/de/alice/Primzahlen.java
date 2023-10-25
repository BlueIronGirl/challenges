package de.alice;

import java.util.ArrayList;
import java.util.List;

public class Primzahlen {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Pruefen ob Zahl eine Primzahl ist
     * (natuerliche Zahl, die groesser als 1 und ausschliesslich durch sich selbst und durch 1 teilbar ist)
     *
     * @param number Zahl
     * @return Primzahl?
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int currentValue = 2; currentValue <= number / 2; currentValue++) {
            if (number % currentValue == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Alle Primzahlen bis zu einem vorgegebenen Wert berechnen
     *
     * @param number Zahl
     * @return Alle Primzahlen
     */
    public static List<Integer> calcPrimesUpTo(int number) {
        List<Integer> result = new ArrayList<>();

        for (int currentNumber = 2; currentNumber < number; currentNumber++) {
            if (isPrime(currentNumber)) {
                result.add(currentNumber);
            }
        }

        return result;
    }

    public static List<Integer> calcPrimesUpToSiebDesEratosthenes(int number) {
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            allNumbers.add(i);
        }

        for (int currentNumber = 2; currentNumber < number; currentNumber++) {
            for (int i = 0; i < number; i++) {

            }
        }

        return null;
    }
}