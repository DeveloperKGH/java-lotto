package lotto;

import java.util.regex.Pattern;

public class NumberUtil {
    private static final Pattern NUMERIC_REGEX_PATTERN = Pattern.compile("-?[0-9]+");

    public static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            int number = toInt(values[i]);
            numbers[i] = number;
        }

        return numbers;
    }

    private static int toInt(String value) {
        if (!NUMERIC_REGEX_PATTERN.matcher(value).matches()) throw new IllegalArgumentException("숫자 이외의 값은 입력할 수 없습니다.");

        int number = Integer.parseInt(value);
        if (number < 0) throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
        return number;
    }
}
