package main.expression;

public class SubSup extends Expression{
    Expression expression;
    Expression power;
    Expression indice;
    public SubSup(Expression expression, Expression indice, String power) {
        this.expression =expression;
        this.indice = indice;
        this.power = new MyNumber(power);
    }
    @Override
    public String toString() {
        return "<msubsup>" + expression.toString() + indice.toString() + power.toString() + "</msubsup>";
    }
}
