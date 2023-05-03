package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class OperationTest {

    @DisplayName("유효하지 않은 값이 입력된 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @ParameterizedTest(name = "symbolInput : {0}")
    @NullAndEmptySource
    void find_by_symbol_with_invalid_value(String symbolInput) {
        assertThatThrownBy(() -> Operation.findBySymbol(symbolInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력한 사칙연산에 해당하는 code 가 없습니다.");
    }

    @DisplayName("+ 연산자를 넣으면 해당 코드의 enum 반환되는지 확인")
    @Test
    void find_by_symbol_with_normal_value() {
        assertThat(Operation.findBySymbol("+")).isEqualTo(Operation.PLUS);
    }

}
