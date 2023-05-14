package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoTicketBoxTest {
    @DisplayName("입력된 금액만큼 로또 구입 가능한 갯수가 반환되는지 확인")
    @Test
    void get_buyable_quantity() {
        assertThat(LottoTicketBox.getBuyableQuantity(15000)).isEqualTo(15);
    }
}
