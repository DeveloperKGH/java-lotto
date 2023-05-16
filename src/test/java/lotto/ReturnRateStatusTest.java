package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ReturnRateStatusTest {
    @DisplayName("수익률이 1을 기준으로 이득 or 손해 가 반환되는지 확인")
    @ParameterizedTest(name = "수익률 : {0}, 상태 : {1}")
    @CsvSource(value = {"0.99:손해", "1:이득"}, delimiter = ':')
    void match_numbers_count_money(double rate, String expected) {
        assertThat(ReturnRateStatus.findByRate(rate).getValue()).isEqualTo(expected);
    }
}
