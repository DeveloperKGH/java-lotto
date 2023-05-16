package lotto;

import java.util.Objects;

public class ReturnRate {
    private final double rate;

    public ReturnRate(double rate) {
        this.rate = rate;
    }

    public static ReturnRate calculate(int winningMoney, int spentMoney) {
        return new ReturnRate(winningMoney / spentMoney);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnRate that = (ReturnRate) o;
        return Double.compare(that.rate, rate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate);
    }
}
