package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberUtilTest {
    @DisplayName("입력된 문자열이 배열이 int 배열로 반환되는지 확인")
    @Test
    void toInts_with_valid_value() {
        assertThat(NumberUtil.toInts(new String[]{"1", "2", "3"})).containsExactly(1, 2, 3);
    }
}
