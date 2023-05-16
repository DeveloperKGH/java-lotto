package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class NumberUtilTest {
    @DisplayName("입력된 문자열이 배열이 int 배열로 반환되는지 확인")
    @Test
    void toInts_with_valid_value() {
        assertThat(NumberUtil.toInts(new String[]{"1", "2", "3"})).containsExactly(1, 2, 3);
    }

    @DisplayName("입력된 문자열이 배열 원소중 숫자가 아닌 다른 형태의 값이 있는경우 IllegalArgumentException 반환되는지 확인")
    @Test
    void toInts_with_not_numeric_element() {
        assertThatThrownBy(() -> NumberUtil.toInts(new String[]{"1", "2", "a"}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자 이외의 값은 입력할 수 없습니다.");
    }

    @DisplayName("입력된 문자열이 배열 원소중 음수가 있는 경우 IllegalArgumentException 반환되는지 확인")
    @Test
    void toInts_with_negative_number_element() {
        assertThatThrownBy(() -> NumberUtil.toInts(new String[]{"1", "2", "-3"}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수는 입력할 수 없습니다.");
    }
}
