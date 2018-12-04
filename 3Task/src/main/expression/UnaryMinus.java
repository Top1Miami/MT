package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class UnaryMinus extends Expression{
    Expression expression;
    public UnaryMinus (Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "<mo>-</mo>" + expression.toString();
    }
}
