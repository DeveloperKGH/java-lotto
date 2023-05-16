package lotto;

public class StringUtil {
    public static final String DEFAULT_DELIMITER = ", ";

    public static int[] split(String textInput) {
        return NumberUtil.toInts(textInput.split(DEFAULT_DELIMITER));
    }
}
