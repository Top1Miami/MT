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
    public Pow (Expression expression, String number) {
        this.expression = expression;
        power = new MyNumber(number);
    }
    @Override
    public String toString() {
        return "<msup>" + expression.toString()  + power.toString() + "</msup>";
    }
}
