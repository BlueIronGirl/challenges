import java.util.StringJoiner;

public class ZahlAlsText {
    public static void main(String[] args) {
        System.out.println(numberAsTextRekursiv(2));
        System.out.println(numberAsTextRekursiv(234));

        System.out.println(numberAsTextIterativ(2));
        System.out.println(numberAsTextIterativ(234));
    }

    /**
     * Zahl in Text umwandeln (Rekursiv)
     *
     * @param number Zahl
     * @return Ergebnis
     */
    static String numberAsTextRekursiv(int number) {
        StringJoiner valueAsText = new StringJoiner(" ");
        final int remainder = number % 10;

        if (number / 10 > 0) {
            valueAsText.add(numberAsTextRekursiv(number / 10));
        }

        String value = digitAsText(remainder);
        valueAsText.add(value);

        return valueAsText.toString().trim();
    }

    /**
     * Zahl in Text umwandeln (Iterativ)
     *
     * @param number Zahl
     * @return Ergebnis
     */
    static String numberAsTextIterativ(int number) {
        StringBuilder valueAsText = new StringBuilder();
        int remainingValue = number;

        while (remainingValue > 0) {
            valueAsText.insert(0, digitAsText(remainingValue % 10) + " ");
            remainingValue /= 10;
        }

        return valueAsText.toString().trim();
    }

    /**
     * Umwandlung von Zahl in Text
     *
     * @param digit Zahl
     * @return Ergebnis
     */
    static String digitAsText(final int digit) {
        return switch (digit) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "ZERO";
        };
    }
}
