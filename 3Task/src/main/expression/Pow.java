package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class Pow extends Expression{
    Expression expression;
    Expression power;
    public Pow (Expression expression, Expression power) {
        this.expression = expression;
        this.power = power;
    }
    @Override
    public String toString() {
        return "<msup><mi>" + expression.toString() + "</mi><mn>" + power.toString() + "</mn></msup>";
    }
}
