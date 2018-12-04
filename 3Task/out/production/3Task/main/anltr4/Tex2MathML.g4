grammar Tex2MathML;

@header {
    package antlr4;
}
/** Rules description */

start returns [Expression expression]
    : DOLLAR left=plus EQUAL right=plus DOLLAR
        {$expression = new Equal($left.expression, $right.expression);}
    | DOLLAR nextExpr=plus DOLLAR
        {$expression = $nextExpr.expression;}
    ;
plus returns [Expression expression]
    : left=plus PLUS right=mult
        {$expression = new Plus($left.expression, $right.expression);}
    | left1=plus PLUS right1=frac
        {$expression = new Plus($left1.expression, $right1.expression);}
    | nexrExpr=frac
        {$expression = $nextExpr.expression;}
    | nextExpr=mult
        {$expression = $nextExpr.expression;}
;
mult returns [Expression expression]
    : left=mult MULT right=atomic
        {$expression= new Mult($left.expression, $right.expression);}
    | nextExpr=atomic
        {$expression= $nextExpr.expression;}
;
atomic returns [Expression expression]
    : MINUS nextExpr=atomic
        {$expression = new UnaryMinus($nextExpr.expression);}
    | BRLEFT nextExpr1=plus BRRIGHT
        {$expression = new Parenthesis($nextExpr1.expression);}
    | nextExpr2=num
        {$expression = $nextExpr2.expression;}
    | SQRT CBRLEFT nextExpr3=plus CBRRIGHT
        {$expression = new Sqrt($nextExpr3.expression);}
    | expr=atomic CBRLEFT power=num CBRRIGHT
        {$expression = new Pow($expr.expression, $power.expression);}
    ;
num returns [Expression expression]
    : SiNum
        {$expression = new MyNumber($SiNum.text);}
    | MuNum
    ;
frac returns [Expression expression]
    : FRAC CBRLEFT left=plus CBRRIGHT CBRLEFT right=plus CBRRIGHT
        {$expression = new Frac($left.expression, $right.expression);}
    ;
/** Token description : */
DOLLAR : '$';
WS : [ \t\r\n]+ -> skip;
SiNum : [1-9];
MuNum : [1-9][0-9]+;
PLUS : '+';
MINUS : '-';
MULT : '*';
FRAC : '\\frac';
CBRLEFT : '{';
CBRRIGHT : '}';
POW : '^';
SQRT : '\\sqrt';
BRLEFT : '(';
BRRIGHT : ')';
EQUAL : '=';
