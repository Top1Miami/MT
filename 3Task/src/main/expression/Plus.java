package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class Plus extends Expression {
    Expression left;
    Expression right;
    public Plus (Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "<mrow>" + left.toString() + "<mo>+</mo>" + right.toString() + "</mrow>";
    }
}
