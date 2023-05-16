package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringUtilTest {
    @DisplayName("입력된 문자열이 콤마+공백을 기준으로 분리되는지 확인")
    @Test
    void split_by_comma_blank() {
        assertThat(StringUtil.split("1, 2, 3")).containsExactly(1, 2, 3);
    }

    @DisplayName("입력된 문자열이 유효하지 않은 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @ParameterizedTest(name = "textInput : {0}")
    @NullAndEmptySource
    void find_by_symbol_with_invalid_value(String textInput) {
        assertThatThrownBy(() -> StringUtil.split(textInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 문자열은 null 또는 공백일 수 없습니다.");
    }
}
