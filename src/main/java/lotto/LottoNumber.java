package lotto;

public class LottoNumber {
    private final int number;

    public LottoNumber(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("로또 번호는 1미만 또는 45 초과일 수 없습니다.");
        }

        this.number = number;
    }
}
