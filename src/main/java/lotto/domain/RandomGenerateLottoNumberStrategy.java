package lotto.domain;

import lotto.util.CollectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomGenerateLottoNumberStrategy implements GenerateLottoNumberStrategy {
    @Override
    public List<LottoNumber> generate(int size, SortLottoNumberStrategy strategy) {
        List<LottoNumber> tempNumbers = new ArrayList<>();

        for (int number = LottoNumber.MIN; number <= LottoNumber.MAX; number++) {
            tempNumbers.add(new LottoNumber(number));
        }

        Collections.shuffle(tempNumbers);
        tempNumbers = CollectionUtil.subListFromZeroToEnd(size, tempNumbers);

        return strategy.sort(tempNumbers);
    }
}
