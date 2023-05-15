package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class LottoTicket {
    private final List<LottoNumber> numbers;

    public LottoTicket(int size, GenerateLottoNumberStrategy generateStrategy, SortLottoNumberStrategy sortStrategy) {
        if (size != 6) {
            throw new IllegalArgumentException("로또 티켓의 번호는 6자리여야 합니다.");
        }

        this.numbers = validateDuplicateNumbers(generateStrategy.generate(size, sortStrategy));
    }

    public static LottoTicket create(int size, GenerateLottoNumberStrategy generateStrategy, SortLottoNumberStrategy sortStrategy) {
        return new LottoTicket(size, generateStrategy, sortStrategy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoTicket that = (LottoTicket) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

    public List<LottoNumber> getNumbers() {
        return numbers;
    }

    private List<LottoNumber> validateDuplicateNumbers(List<LottoNumber> numbers) {
        if (new HashSet<>(numbers).size() != numbers.size()) {
            throw new IllegalArgumentException("로또 번호에 중복된 숫자가 있습니다.");
        }

        return numbers;
    }

    @Override
    public String toString() {
        return "LottoTicket{" +
                "numbers=" + numbers +
                '}';
    }
}
