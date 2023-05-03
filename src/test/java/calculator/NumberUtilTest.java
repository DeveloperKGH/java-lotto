package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberUtilTest {

    @DisplayName("0을 넣은경우 true, 0 이외의 값은 false 가 반환되는지 확인")
    @ParameterizedTest(name = "testValue : {0}, 결과값 : {1}")
    @CsvSource(value = {"0:true", "1:false"}, delimiter = ':')
    void is_zero(String number, boolean expected) {
        Assertions.assertThat(NumberUtil.isZero(number)).isEqualTo(expected);
    }

    @DisplayName("짝수를 넣으면 true, 이외의 값은 false 가 반환되는지 확인")
    @ParameterizedTest(name = "testValue : {0}, 결과값 : {1}")
    @CsvSource(value = {"1:false", "2:true"}, delimiter = ':')
    void is_even_number(int number, boolean expected) {
        Assertions.assertThat(NumberUtil.isEvenNumber(number)).isEqualTo(expected);
    }

}
