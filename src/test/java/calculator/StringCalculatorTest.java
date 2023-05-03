package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringCalculatorTest {

    @DisplayName("덧셈 사칙연산 기호가 포함 된 입력된 문자열이 덧셈 사칙연산 결과가 반환되는지 확인")
    @Test
    void plus() {
        assertThat(StringCalculator.calculate("0.1 + 0.2")).isEqualTo("0.3");
    }

    @DisplayName("뺄셈 사칙연산 기호가 포함 된 입력된 문자열이 뺄셈 사칙연산 결과가 반환되는지 확인")
    @Test
    void minus() {
        assertThat(StringCalculator.calculate("2.2 - 1")).isEqualTo("1.2");
    }

    @DisplayName("곱셈 사칙연산 기호가 포함 된 입력된 문자열이 곱셈 사칙연산 결과가 반환되는지 확인")
    @Test
    void multiply() {
        assertThat(StringCalculator.calculate("3.3 * 2")).isEqualTo("6.6");
    }

    @DisplayName("나눗셈 사칙연산 기호가 포함 된 입력된 문자열이 나눗셈 사칙연산의 정수 결과값이 반환되는지 확인")
    @Test
    void divide() {
        assertThat(StringCalculator.calculate("11 / 2")).isEqualTo("5");
    }

    @DisplayName("나눗셈 사칙연산시 0으로 나누려는 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void divide_by_zero() {
        assertThatThrownBy(() -> StringCalculator.calculate("4.7 / 0"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("0으로 나눌 수 없습니다.");
    }

    @DisplayName("입력된 순서대로 사칙연산이 되는지 확인")
    @Test
    void operate_multiple_values() {
        assertThat(StringCalculator.calculate("1 + 5 * 3")).isEqualTo("18");
    }

}
