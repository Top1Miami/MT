grammar Tex2MathML;

@header {
package main.generatedParserLexer;
import main.expression.*;
}
/** Rules description */

begin returns [Expression expression]
    : DOLLAR left=plus EQUAL right=plus DOLLAR
        {$expression = new Equal($left.expression, $right.expression);}
    | DOLLAR left1=minus EQUAL right1=minus DOLLAR
        {$expression = new Equal($left1.expression, $right1.expression);}
    | DOLLAR nextExpr=plus DOLLAR
        {$expression = $nextExpr.expression;}
    | DOLLAR nextExpr1=minus DOLLAR
        {$expression = $nextExpr1.expression;}
    ;
plus returns [Expression expression]
    : left=plus PLUS right=mult
        {$expression = new Plus($left.expression, $right.expression);}
    | left1=plus PLUS right1=frac
        {$expression = new Plus($left1.expression, $right1.expression);}
    | nextExpr1=frac
        {$expression = $nextExpr1.expression;}
    | nextExpr=mult
        {$expression = $nextExpr.expression;}
;
minus returns [Expression expression]
    : left=minus MINUS right=minus
        {$expression = new Minus($left.expression, $right.expression);}
    | left1=plus MINUS right1=frac
        {$expression = new Minus($left1.expression, $right1.expression);}
    | nextExpr1=frac
        {$expression = $nextExpr1.expression;}
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
    | BRLEFT nextExpr5=minus BRRIGHT
        {$expression = new Parenthesis($nextExpr5.expression);}
    | nextExpr2=num
        {$expression = $nextExpr2.expression;}
    | SQRT CBRLEFT nextExpr3=plus CBRRIGHT
        {$expression = new Sqrt($nextExpr3.expression);}
    | SQRT CBRLEFT nextExpr4=minus CBRRIGHT
        {$expression = new Sqrt($nextExpr4.expression);}
    | expr4=atomic INDICE index1=num POW SiNum
        {$expression = new SubSup($expr4.expression, $index1.expression, $SiNum.text);}
    | expr5=atomic INDICE index2=num POW CBRLEFT MuNum CBRRIGHT
        {$expression = new SubSup($expr5.expression, $index2.expression, $MuNum.text);}
    | expr6=atomic INDICE index3=num POW Letters
        {$expression = new SubSup($expr6.expression, $index3.expression, $Letters.text);}
    | expr=atomic POW CBRLEFT power=num CBRRIGHT
        {$expression = new Pow($expr.expression, $power.expression);}
    | expr1=atomic POW SiNum
        {$expression = new Pow($expr1.expression, $SiNum.text);}
    | expr2=atomic POW Letters
        {$expression = new Pow($expr2.expression, $Letters.text);}
    | expr3=atomic INDICE index=num
        {$expression = new Sub($expr3.expression, $index.expression);}
    ;
num returns [Expression expression]
    : SiNum
        {$expression = new MyNumber($SiNum.text);}
    | MuNum
        {$expression = new MyNumber($MuNum.text);}
    | Letters
        {$expression = new MyNumber($Letters.text);}
    ;
frac returns [Expression expression]
    : FRAC CBRLEFT left=plus CBRRIGHT CBRLEFT right=plus CBRRIGHT
        {$expression = new Frac($left.expression, $right.expression);}
    | FRAC CBRLEFT left1=minus CBRRIGHT CBRLEFT right1=minus CBRRIGHT
          {$expression = new Frac($left1.expression, $right1.expression);}
    ;
/** Token description : */
INDICE : '_';
DOLLAR : '$';
WS : [ \t\r\n]+ -> skip;
SiNum : [1-9];
MuNum : [1-9][0-9]+;
Letters : [a-z]+;
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
