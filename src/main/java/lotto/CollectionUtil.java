package lotto;

import java.util.List;

public class CollectionUtil {
    public static final int ZERO = 0;

    public static <T> List<T> subListFromZeroToEnd(int end, List<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return collection;
        }

        if (end <= ZERO) {
            throw new ArrayIndexOutOfBoundsException("end 가 0보다 같거나 작을 수 없습니다.");
        }

        return collection.subList(ZERO, end);
    }
}
