package lotto;

import java.util.List;
import java.util.Objects;

public class LottoTicket {
    private final List<LottoNumber> numbers;

    public LottoTicket(int size, GenerateLottoNumberStrategy strategy) {
        if (size != 6) {
            throw new IllegalArgumentException("로또 티켓의 번호는 6자리여야 합니다.");
        }

        this.numbers = strategy.generate(size);
    }

    public static LottoTicket create(int size, GenerateLottoNumberStrategy strategy) {
        return new LottoTicket(size, strategy);
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
}
