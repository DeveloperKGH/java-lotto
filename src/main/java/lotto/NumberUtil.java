package lotto;

public class NumberUtil {
    public static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            int number = toInt(values[i]);
            numbers[i] = number;
        }

        return numbers;
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }
}
