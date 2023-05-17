package lotto.domain;

import lotto.domain.LottoNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class LottoNumberTest {
    @DisplayName("로또 번호 객체가 정상적으로 생성되는지 확인")
    @Test
    void create_lotto_number() {
        assertThat(new LottoNumber(1)).isEqualTo(new LottoNumber(1));
    }

    @DisplayName("로또 번호의 범위가 유효하지 않다면 IllegalArgumentException 예외 발생")
    @ParameterizedTest(name = "testValue : {0}")
    @ValueSource(ints = {0, 46})
    void lotto_number_is_out_of_range(int number) {
        assertThatThrownBy(() -> new LottoNumber(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 번호는 1미만 또는 45 초과일 수 없습니다.");
    }
}
