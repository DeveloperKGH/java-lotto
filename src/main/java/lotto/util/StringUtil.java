package lotto.util;

import lotto.util.NumberUtil;

public class StringUtil {
    public static final String DEFAULT_DELIMITER = ", ";

    public static int[] split(String textInput) {
        if (textInput == null || textInput.isBlank()) {
            throw new IllegalArgumentException("입력된 문자열은 null 또는 공백일 수 없습니다.");
        }

        return NumberUtil.toInts(textInput.split(DEFAULT_DELIMITER));
    }
}
