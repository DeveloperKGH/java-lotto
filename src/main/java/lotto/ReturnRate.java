package lotto;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;

public class ReturnRate {
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
    private final double rate;

    public ReturnRate(double rate) {
        this.rate = rate;
    }

    public static ReturnRate calculate(int winningMoney, int spentMoney) {
        double rate = (double) winningMoney / spentMoney;
        return new ReturnRate(formatRate(rate));
    }

    private static double formatRate(double rate) {
        DECIMAL_FORMAT.setRoundingMode(RoundingMode.FLOOR);
        return Double.parseDouble(DECIMAL_FORMAT.format(rate));
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

    @Override
    public String toString() {
        return "ReturnRate{" +
                "rate=" + rate +
                '}';
    }
}
