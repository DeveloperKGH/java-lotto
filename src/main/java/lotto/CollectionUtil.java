package lotto;

import java.util.List;

public class CollectionUtil {
    public static final int ZERO = 0;

    public static <T> List<T> subListFromZeroToEnd(int end, List<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return collection;
        }

        return collection.subList(ZERO, end);
    }
}
