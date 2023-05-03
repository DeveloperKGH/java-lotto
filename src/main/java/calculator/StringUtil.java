package calculator;

import java.util.regex.Pattern;

public class StringUtil {
    public static final String DEFAULT_DELIMITER = " ";
    private static final Pattern NUMERIC_REGEX_PATTERN = Pattern.compile("^[+-]?\\d*(\\.?\\d*)$");
    private static final Pattern OPERATION_SYMBOL_REGEX_PATTERN = Pattern.compile("[+\\-*/]");

    public static String[] split(String textInput) {
        validateTextInput(textInput);
        return validateArray(textInput.split(DEFAULT_DELIMITER));
    }

    private static void validateTextInput(String textInput) {
        if (textInput == null || textInput.isBlank()) {
            throw new IllegalArgumentException("입력된 문자열이 null 또는 공백 일 수 없습니다.");
        }
    }

    private static String[] validateArray(String[] values) {
        if (NumberUtil.isEvenNumber(values.length)) {
            throw new IllegalArgumentException("분리된 문자열 배열 size 는 짝수 일 수 없습니다.");
        }

        for (int i = 0; i < values.length; i++) {
            validateArrayElement(i, values[i]);
        }

        return values;
    }

    private static void validateArrayElement(int index, String value) {
        if (NumberUtil.isEvenNumber(index + 1)) {
            isOperationSymbol(value);
            return;
        }

        isNumber(value);
    }

    private static void isNumber(String value) {
        if (!NUMERIC_REGEX_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException("숫자 이외의 값은 입력할 수 없습니다.");
        }
    }

    private static void isOperationSymbol(String value) {
        if (!OPERATION_SYMBOL_REGEX_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException("사칙연산 기호 이외의 값은 입력할 수 없습니다.");
        }
    }
}
