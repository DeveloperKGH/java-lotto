package lotto;

public class InputValidator {
    public static final int UNIT_PRICE = 1000;

    public static void validateMoney(int money) {
        if (money < UNIT_PRICE) {
            throw new IllegalArgumentException("입력된 금액이 1000원 미만일 수 없습니다.");
        }

        if (money % UNIT_PRICE != 0) {
            throw new IllegalArgumentException("입력된 금액이 1000원 단위가 아닙니다.");
        }
    }
}
