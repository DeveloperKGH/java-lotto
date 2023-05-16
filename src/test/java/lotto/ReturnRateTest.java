package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReturnRateTest {
    @DisplayName("당첨된 금액이 0인 경우 수익률도 0 이 반환되는지 확인")
    @Test
    void calculate_with_winning_money_0() {
        assertThat(ReturnRate.calculate(0, 1000)).isEqualTo(new ReturnRate(0));
    }

    @DisplayName("당첨된 금액이 0 이상인 경우 소숫점 둘째자리까지의 수익률이 계산되어 반환 되는지 확인")
    @Test
    void calculate_second_decimal() {
        assertThat(ReturnRate.calculate(5000, 14000)).isEqualTo(new ReturnRate(0.35));
    }
}
