package lotto.util;

public class InputValidator {
    public static final int UNIT_PRICE = 1000;
    public static final int DEFAULT_LOTTO_WINNING_NUMBER_SIZE = 6;
    public static final int MIN = 1;
    public static final int MAX = 45;

    public static void validateMoney(int money) {
        if (money < UNIT_PRICE) {
            throw new IllegalArgumentException("입력된 금액이 1000원 미만일 수 없습니다.");
        }

        if (money % UNIT_PRICE != 0) {
            throw new IllegalArgumentException("입력된 금액이 1000원 단위가 아닙니다.");
        }
    }

    public static void validateLottoWinningNumbers(int[] numbers) {
        if (numbers.length != DEFAULT_LOTTO_WINNING_NUMBER_SIZE) {
            throw new IllegalArgumentException("입력된 당첨번호가 6자리여야 합니다.");
        }

        for (int number : numbers) {
            validateValueRange(number);
        }

    }

    private static void validateValueRange(int number) {
        if (number < MIN || number > MAX) {
            throw new IllegalArgumentException("당첨된 번호는 1미만 또는 45 초과일 수 없습니다.");
        }
    }
}
