package by.epam.info.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathClient {

    private static final String BLANK_REGEX = "\\p{Blank}";
    private static final int FIRST_CHAR = 0;
    private ArrayList<MathExpression> expressionList;

    public MathClient(String expression) {
        expressionList = new ArrayList<>();
        parseExpr(expression);
    }

    private List<MathExpression> parseExpr(String expression) {
        List<MathExpression> expressionList = new ArrayList<>();


        for (String lexeme : expression.split(BLANK_REGEX)) {
            if (lexeme.isEmpty()) {
                continue;
            }

            switch (lexeme.charAt(FIRST_CHAR)) {
                case '+':
                    expressionList.add(new TermExpressionAdd());
                    break;
                case '-':
                    expressionList.add(new TermExpressionSubtract());
                    break;
                case '*':
                    expressionList.add(new TermExpressionMultiply());
                    break;
                case '/':
                    expressionList.add(new TermExpressionDivide());
                    break;
                case '#':
                    expressionList.add(new TermExpressionIncrement());
                    break;
                case '@':
                    expressionList.add(new TermExpressionDecrement());
                    break;
                default:
                    Scanner scan = new Scanner(lexeme);
                    if (scan.hasNextDouble()) {
                        expressionList.add(new NonTermExpressionNumber(scan.nextDouble()));
                    }
            }
        }
        return expressionList;
    }

    public Number calculate(String expression) {
        Context context = new Context();
        for (MathExpression expr : parseExpr(expression)) {
            expr.interpret(context);
        }
        return context.popValue();
    }

}
