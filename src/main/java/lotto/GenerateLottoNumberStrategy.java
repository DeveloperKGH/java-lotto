package lotto;

import java.util.List;

public interface GenerateLottoNumberStrategy {
    List<LottoNumber> generate(int size);
}
