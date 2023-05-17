package lotto.domain;

import java.util.List;

public interface GenerateLottoNumberStrategy {
    List<LottoNumber> generate(int size, SortLottoNumberStrategy strategy);
}
