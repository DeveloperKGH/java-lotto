package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class LottoTicketBoxTest {
    @DisplayName("입력된 금액이 1000원 미만인 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void buy_lotto_tickets_with_money_less_than_1000() {
        assertThatThrownBy(() -> LottoTicketBox.buyTickets(900))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 금액이 1000원 미만일 수 없습니다.");
    }

    @DisplayName("입력된 금액이 1000원 단위가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void buy_lotto_tickets_with_money_1000원_단위가_아님() {
        assertThatThrownBy(() -> LottoTicketBox.buyTickets(1150))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 금액이 1000원 단위가 아닙니다.");
    }
}
