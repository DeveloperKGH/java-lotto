package lotto.domain;

import lotto.domain.LottoNumber;
import lotto.domain.LottoTicket;
import lotto.domain.RandomGenerateLottoNumberStrategy;
import lotto.domain.SortByAscendingStrategy;
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
    private final int DEFAULT_LOTTO_NUMBER_SIZE = 6;

    private List<LottoNumber> lottoNumbers;

    @BeforeEach
    public void beforeEach() {
        lottoNumbers = Arrays.asList(new LottoNumber(1), new LottoNumber(2), new LottoNumber(3));
    }

    @DisplayName("로또 티켓 객체가 정상적으로 생성되는지 확인")
    @Test
    void create_lotto_ticket() {
        assertThat(LottoTicket.create(DEFAULT_LOTTO_NUMBER_SIZE, (size, sortStrategy) -> lottoNumbers, new SortByAscendingStrategy())).isEqualTo(LottoTicket.create(DEFAULT_LOTTO_NUMBER_SIZE, (size, sortStrategy) -> lottoNumbers, new SortByAscendingStrategy()));
    }

    @DisplayName("로또 티켓의 번호가 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인")
    @ParameterizedTest(name = "testValue : {0}")
    @ValueSource(ints = {5, 7})
    void create_lotto_ticket_numbers_size_is_not_6(int number) {
        assertThatThrownBy(() -> LottoTicket.create(number, new RandomGenerateLottoNumberStrategy(), new SortByAscendingStrategy()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 티켓의 번호는 6자리여야 합니다.");
    }

    @DisplayName("로또 티켓의 번호 중 중복이 있다면 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void lotto_ticket_has_duplicate_number() {
        assertThatThrownBy(() -> LottoTicket.create(DEFAULT_LOTTO_NUMBER_SIZE, (size, sortStrategy) -> Arrays.asList(new LottoNumber(1), new LottoNumber(2), new LottoNumber(2)), new SortByAscendingStrategy()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 번호에 중복된 숫자가 있습니다.");
    }

    @DisplayName("생성된 로또 티켓의 번호가 오름차순 정렬이 되어 반환되는지 확인")
    @Test
    void lotto_ticket_number_sort_ASC() {
        assertThat(LottoTicket.create(DEFAULT_LOTTO_NUMBER_SIZE, (size, strategy) -> strategy.sort(Arrays.asList(new LottoNumber(3), new LottoNumber(2), new LottoNumber(1))), new SortByAscendingStrategy()).getNumbers()).isEqualTo(lottoNumbers);
    }
}
