package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RewardTest {
    @DisplayName("당첨된 갯수에 해당하는 상금이 반환되는지 확인")
    @ParameterizedTest(name = "당첨된 갯수 : {0}, 상금 : {1}")
    @CsvSource(value = {"3:5000", "4:50000", "5:1500000", "6:2000000000"}, delimiter = ':')
    void match_numbers_count_money(int matchNumbersCount, int money) {
        assertThat(Reward.findByMatchNumbersCount(matchNumbersCount).getMoney()).isEqualTo(money);
    }
}
