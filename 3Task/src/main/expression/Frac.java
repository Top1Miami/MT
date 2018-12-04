package main.expression;

/**
 * Created by Dima on 04.12.2018.
 */
public class Frac extends Expression {
    Expression left;
    Expression right;
    public Frac (Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "<mfrac>" + left.toString() + right.toString() + "</mfrac>";
    }
}
