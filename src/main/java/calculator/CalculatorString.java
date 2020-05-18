package calculator;

public class CalculatorString {

    private CalculatorSymbol calculatorSymbol = CalculatorSymbol.getInstance();

    public int calculate(String input) {

        String[] strings = ParserUtils.toArray(input);
        ParserUtils.checkArraySize(strings);

        int total = ParserUtils.getNumber(strings[0]);

        for (int index = 1; index < strings.length; index += 2) {
            total = calculatorSymbol.findTypeAndCalculator(total, ParserUtils.getNumber(strings[index + 1]), strings[index]);
        }
        return total;
    }
}
