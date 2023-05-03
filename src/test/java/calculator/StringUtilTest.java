package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringUtilTest {

    @DisplayName("입력된 문자열을 빈공백 기준으로 분리 시, 배열의 사이즈가 짝수가 반환되는 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void split_array_size_even_number_illegal_argument_exception() {
        assertThatThrownBy(() -> StringUtil.split("1 + "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("분리된 문자열 배열 size 는 짝수 일 수 없습니다.");
    }

    @DisplayName("입력된 문자열을 빈공백 기준으로 분리 시, 홀수번째 원소가 숫자가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void split_array_element_odd_number_illegal_argument_exception() {
        assertThatThrownBy(() -> StringUtil.split("1 + ㄱ"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자 이외의 값은 입력할 수 없습니다.");
    }

    @DisplayName("입력된 문자열을 빈공백 기준으로 분리 시, 짝수번째 원소가 사칙연산 기호가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인")
    @Test
    void split_array_element_even_number_illegal_argument_exception() {
        assertThatThrownBy(() -> StringUtil.split("1 ㄱ 3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("사칙연산 기호 이외의 값은 입력할 수 없습니다.");
    }

}
