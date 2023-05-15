package lotto;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class LottoTicketTest {
    private List<LottoNumber> lottoNumbers;

    @BeforeEach
    public void beforeEach() {
        lottoNumbers = Arrays.asList(new LottoNumber(1), new LottoNumber(2), new LottoNumber(3));
    }

    @DisplayName("로또 티켓 객체가 정상적으로 생성되는지 확인")
    @Test
    void create_lotto_ticket() {
        assertThat(LottoTicket.create(6, size -> lottoNumbers)).isEqualTo(LottoTicket.create(6, size -> lottoNumbers));
    }

    @DisplayName("로또 티켓의 번호가 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인")
    @ParameterizedTest(name = "testValue : {0}")
    @ValueSource(ints = {5, 7})
    void create_lotto_ticket_numbers_size_is_not_6(int number) {
        assertThatThrownBy(() -> LottoTicket.create(number, new RandomGenerateLottoNumberStrategy()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 티켓의 번호는 6자리여야 합니다.");
    }
}
