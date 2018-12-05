package main.expression;

public class Sub extends Expression{
    Expression expression;
    Expression index;
    public Sub(Expression expression, Expression index) {
        this.expression = expression;
        this.index = index;
    }
    @Override
    public String toString() {
        return "<msub>" + expression.toString() + index.toString() + "</msub>";
    }
}
