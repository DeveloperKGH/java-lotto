package lotto.domain;

import lotto.domain.LottoNumber;
import lotto.domain.WinningLottoNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class WinningLottoNumbersTest {
    private List<LottoNumber> lottoNumbers;

    @BeforeEach
    public void beforeEach() {
        lottoNumbers = Arrays.asList(new LottoNumber(1), new LottoNumber(2), new LottoNumber(3), new LottoNumber(4), new LottoNumber(5), new LottoNumber(6));
    }

    @DisplayName("로또 당첨번호 객체가 정상적으로 생성되는지 확인")
    @Test
    void create_winning_lotto_numbers() {
        assertThat(WinningLottoNumbers.create(lottoNumbers)).isEqualTo(WinningLottoNumbers.create(lottoNumbers));
    }

    @DisplayName("로또 당첨번호 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void create_winning_lotto_numbers_size_is_not_6() {
        assertThatThrownBy(() -> WinningLottoNumbers.create(Arrays.asList(new LottoNumber(1))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("당첨번호는 6자리여야 합니다.");
    }

    @DisplayName("로또 당첨번호 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void match_winning_lotto_numbers() {
        WinningLottoNumbers winningLottoNumbers = WinningLottoNumbers.create(lottoNumbers);
        assertThat(winningLottoNumbers.countMatchNumbers(Arrays.asList(new LottoNumber(1), new LottoNumber(2), new LottoNumber(20)))).isEqualTo(2);
    }
}
