package lotto;

import java.util.Collections;
import java.util.List;

public class SortByAscendingStrategy implements SortLottoNumberStrategy {
    @Override
    public List<LottoNumber> sort(List<LottoNumber> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
}
