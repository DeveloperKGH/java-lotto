package calculator;

public class StringCalculator {

    public static String calculate(String textInput) {
        String[] values = StringUtil.split(textInput);

        String result = values[0];

        for (int i = 1; i < values.length - 1; i += 2) {
            String symbol = values[i];
            result = Operation.findBySymbol(symbol).operate(result, values[i + 1]);
        }

        return result;
    }

}

