package de.alice;

import java.util.ArrayList;

public class Grundrechenarten {
    public static void main(String[] args) {
        System.out.println(calc(6, 7));
        System.out.println(calc(3, 4));
        System.out.println(calc(5, 5));
    }

    /**
     * Zwei Zahlen multiplizieren, dann das Produkt halbieren und den Rest bezueglich der Division durch 7 zurueckgeben
     *
     * @param number1 number1
     * @param number2 number2
     * @return Ergebnis
     */
    public static int calc(int number1, int number2) {
        return (number1 * number2 / 2) % 7;
    }

    /**
     * Anzahl und Summe der natürlichen Zahlen, die durch 2 oder 7 teilbar sind, bis zu einem gegebenen Maximalwert (exclusiv)
     *
     * @param max Maximum
     * @return Anzahl und Summe
     */
    public static long[] calcSumAndCountAllNumbersDivBy_2_Or_7(int max) {
        ArrayList<Integer> teilBarDurch2Or7 = new ArrayList<>();

        for (int currentNumber = 1; currentNumber < max; currentNumber++) {
            if (currentNumber % 2 == 0 || currentNumber % 7 == 0) {
                teilBarDurch2Or7.add(currentNumber);
            }
        }

        long iAnzahl = teilBarDurch2Or7.size();
        long iSum = teilBarDurch2Or7.stream().mapToInt(Integer::intValue).sum();

        return new long[]{iAnzahl, iSum};
    }

    /**
     * Zahl ist gerade?
     *
     * @param number Zahl
     * @return Ergebnis
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Zahl ist ungerade?
     *
     * @param number Zahl
     * @return Ergebnis
     */
    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}