package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public enum Operation {
    PLUS("+") {
        @Override
        String operate(String x, String y) {
            return new BigDecimal(x).add(new BigDecimal(y)).toString();
        }
    },
    MINUS("-") {
        @Override
        String operate(String x, String y) {
            return new BigDecimal(x).subtract(new BigDecimal(y)).toString();
        }
    },
    MULTIPLY("*") {
        @Override
        String operate(String x, String y) {
            return new BigDecimal(x).multiply(new BigDecimal(y)).toString();
        }
    },
    DIVIDE("/") {
        @Override
        String operate(String x, String y) {
            if (NumberUtil.isZero(y)) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return new BigDecimal(x).divide(new BigDecimal(y), RoundingMode.FLOOR).toString();
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract String operate(String x, String y);

    public static Operation findBySymbol(String symbol) {
        return Arrays.stream(Operation.values())
                .filter(s -> s.symbol.equals(symbol))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("입력한 사칙연산에 해당하는 code 가 없습니다."));
    }
}
