package lotto.domain.enums;

import java.util.Arrays;

public enum ReturnRateStatus {

    LOSS("손해", 0, 1),
    PROFIT("이득", 1, 2);

    private final String value;
    private final double startRate;
    private final double endRate;

    ReturnRateStatus(String name, double startRate, double endRate) {
        this.value = name;
        this.startRate = startRate;
        this.endRate = endRate;
    }

    public static ReturnRateStatus findByRate(double rate) {
        return Arrays.stream(ReturnRateStatus.values())
                .filter(returnRateStatus -> returnRateStatus.betweenRate(rate))
                .findAny()
                .orElseThrow(() -> new RuntimeException("수익률에 해당하는 범위의 code 가 없습니다."));
    }

    public boolean betweenRate(double rate) {
        return this.startRate <= rate && this.endRate > rate;
    }

    public String getValue() {
        return value;
    }
}
