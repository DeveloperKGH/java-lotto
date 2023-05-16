package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class InputValidatorTest {
    @DisplayName("입력된 금액이 1000원 미만인 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void money_is_less_than_1000() {
        assertThatThrownBy(() -> InputValidator.validateMoney(900))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 금액이 1000원 미만일 수 없습니다.");
    }

    @DisplayName("입력된 금액이 1000원 단위가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void money_is_not_1000원단위() {
        assertThatThrownBy(() -> InputValidator.validateMoney(1150))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 금액이 1000원 단위가 아닙니다.");
    }

    @DisplayName("입력된 당첨번호가 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void lotto_winning_numbers_size_is_not_6() {
        assertThatThrownBy(() -> InputValidator.validateLottoWinningNumbers(new int[]{1, 2, 3}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 당첨번호가 6자리여야 합니다.");
    }

    @DisplayName("입력된 당첨번호의 범위가 유효하지 않다면 IllegalArgumentException 예외 발생")
    @Test
    void lotto_winning_number_is_out_of_range() {
        assertThatThrownBy(() -> InputValidator.validateLottoWinningNumbers(new int[]{0, 1, 2, 3, 4, 5}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("당첨된 번호는 1미만 또는 45 초과일 수 없습니다.");
    }
}
