package lotto.domain;

import java.util.List;
import java.util.Objects;

public class WinningLottoNumbers {
    public static final int DEFAULT_LOTTO_NUMBER_SIZE = 6;

    private final List<LottoNumber> winningNumbers;

    public WinningLottoNumbers(List<LottoNumber> winningNumbers) {
        if (winningNumbers.size() != DEFAULT_LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException("당첨번호는 6자리여야 합니다.");
        }

        this.winningNumbers = winningNumbers;
    }

    public static WinningLottoNumbers create(List<LottoNumber> numbers) {
        return new WinningLottoNumbers(numbers);
    }

    public int countMatchNumbers(List<LottoNumber> numbers) {
        return (int) numbers.stream()
                .filter(winningNumbers::contains)
                .count();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WinningLottoNumbers that = (WinningLottoNumbers) o;
        return Objects.equals(winningNumbers, that.winningNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winningNumbers);
    }
}
