package by.epam.info.interpreter;


public class TermExpressionMultiply extends MathExpression {

      @Override
    public void interpret(Context context) {

          double firstValue = context.popValue();
          double secondValue = context.popValue();

          context.pushValue(firstValue * secondValue);
    }

}
