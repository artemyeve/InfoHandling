package by.epam.info.interpreter;

public class NonTermExpressionNumber extends MathExpression {

    private double number;

    public NonTermExpressionNumber(double number) {
        this.number = number;
    }

    @Override
    public void interpret(Context context) {

        context.pushValue(number);
    }

}
