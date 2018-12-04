package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class Parenthesis extends Expression{
    Expression expression;
    public Parenthesis(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "<mrow><mo>(</mo><mrow>" + expression.toString() + "</mrow><mo>)</mo></mrow>";
    }
}
