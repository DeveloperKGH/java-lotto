package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {
    @DisplayName("입력된 문자열이 콤마+공백을 기준으로 분리되는지 확인")
    @Test
    void split_by_comma_blank() {
        assertThat(StringUtil.split("1, 2, 3")).containsExactly(1, 2, 3);
    }
}
