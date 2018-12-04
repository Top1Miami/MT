package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class Sqrt extends Expression{
    Expression expression;
    public Sqrt (Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "<msqrt>" + expression.toString() + "</msqrt>";
    }
}
