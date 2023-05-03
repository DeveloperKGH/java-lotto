package calculator;

public class NumberUtil {
    private static final int ZERO = 0;

    public static boolean isZero(String value) {
        return ZERO == Integer.parseInt(value);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == ZERO;
    }

}
