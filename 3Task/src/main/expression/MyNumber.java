package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class MyNumber extends Expression{
    Expression expression;
    public MyNumber(String number) {
        expression = new Expression(number);
    }
    @Override
    public String toString() {
        return "<mn>" + expression.content + "</mn>";
    }
}
