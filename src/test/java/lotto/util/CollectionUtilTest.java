package lotto.util;

import lotto.util.CollectionUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CollectionUtilTest {
    @DisplayName("subListFromZeroToEnd() null 값이 입력된 경우")
    @Test
    void sub_list_from_zero_to_end_with_null_value() {
        assertThat(CollectionUtil.subListFromZeroToEnd(1, null)).isNull();
    }

    @DisplayName("subListFromZeroToEnd() empty array 값이 입력된 경우")
    @Test
    void sub_list_from_zero_to_end_with_empty_array() {
        assertThat(CollectionUtil.subListFromZeroToEnd(1, Collections.EMPTY_LIST)).isEmpty();
    }

    @DisplayName("subListFromZeroToEnd() end 값이 0보다 작거나 같은경우 ArrayIndexOutOfBoundsException 반환되는지 확인")
    @Test
    void sub_list_from_zero_to_end_with_end_value_is_less_than_1() {
        assertThatThrownBy(() -> CollectionUtil.subListFromZeroToEnd(0, Arrays.asList(1, 2, 3)))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("end 가 0보다 같거나 작을 수 없습니다.");
    }
}
