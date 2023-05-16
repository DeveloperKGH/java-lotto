package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReturnRateTest {
    @DisplayName("로또 당첨번호 객체가 정상적으로 생성되는지 확인")
    @Test
    void calculate() {
        assertThat(ReturnRate.calculate(0, 1000)).isEqualTo(new ReturnRate(0));
    }

}
