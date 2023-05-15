package lotto;

import java.util.List;

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
}
