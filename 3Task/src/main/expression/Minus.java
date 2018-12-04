package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class Minus extends Expression {
    Expression left;
    Expression right;
    public Minus (Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "<mrow>" + left.toString() + "<mo>-</mo>" + right.toString() + "</mrow>";
    }
}
