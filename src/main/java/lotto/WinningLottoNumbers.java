package lotto;

import java.util.List;
import java.util.Objects;

public class WinningLottoNumbers {
    public static final int DEFAULT_LOTTO_NUMBER_SIZE = 6;

    private final List<LottoNumber> numbers;

    public WinningLottoNumbers(List<LottoNumber> numbers) {
        if (numbers.size() != DEFAULT_LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException("당첨번호는 6자리여야 합니다.");
        }

        this.numbers = numbers;
    }

    public static WinningLottoNumbers create(List<LottoNumber> numbers) {
        return new WinningLottoNumbers(numbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WinningLottoNumbers that = (WinningLottoNumbers) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
