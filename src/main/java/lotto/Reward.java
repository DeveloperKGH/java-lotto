package lotto;

import java.util.Arrays;

public enum Reward {

    FIRST(6, 2000000000),
    SECOND(5, 1500000),
    Third(4, 50000),
    Fourth(3, 5000);


    private final int matchNumbersCount;
    private final int money;

    Reward(int matchNumbersCount, int money) {
        this.matchNumbersCount = matchNumbersCount;
        this.money = money;
    }

    public static Reward findByMatchNumbersCount(int matchNumbersCount) {
        return Arrays.stream(Reward.values())
                .filter(reward -> reward.isEqualMatchNumbersCount(matchNumbersCount))
                .findAny()
                .orElseThrow(() -> new RuntimeException("당첨된 숫자 갯수에 해당하는 범위의 code 가 없습니다."));
    }

    public boolean isEqualMatchNumbersCount(int matchNumbersCount) {
        return this.matchNumbersCount == matchNumbersCount;
    }

    public int getMoney() {
        return money;
    }
}
