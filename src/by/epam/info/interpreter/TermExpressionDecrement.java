package by.epam.info.interpreter;


public class TermExpressionDecrement extends MathExpression {
    @Override
    public void interpret(Context context) {
        context.pushValue(context.popValue() - 1);
    }
}
