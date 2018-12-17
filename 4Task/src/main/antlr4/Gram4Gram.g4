grammar Gram4Gram;

@header {
package main.generatedLexerParser;
import main.classes4gram.*;
}
/** Rules Description :*/
begin returns [Grammar gram]
    : NonTerm {$gram = new Grammar($NonTerm.text);}
        lexerParser[$gram]
    ;
lexerParser[Grammar gram]
    : list=ruleList {gram.setRules($list.rsl);}
    list1=lexemList {gram.setLexems($list1.ll);}
    ;
lexemList returns[ArrayList<Lexem> ll]
    : single1=singleLexem
        {$ll = new ArrayList<>();}
        {$ll.add($single1.l);}
    | single=singleLexem other=lexemList
        {$ll = new ArrayList<>();}
        {$ll.add($single.l);}
        {$ll.addAll($other.ll);}
    ;
singleLexem returns[Lexem l]
    :   Term Colon Regexp
        {$l = new Lexem($Term.text, $Regexp.text);}
    ;
ruleList returns[ArrayList<RuleSet> rsl]
    : first=ruleSet other=ruleList
        {$rsl = new ArrayList<>();}
        {$rsl.add($first.rs);}
        {$rsl.addAll($other.rsl);}
    | first1=ruleSet
        {$rsl = new ArrayList<>();}
        {$rsl.add($first1.rs);}
    ;
ruleSet returns[RuleSet rs]
    : NonTerm Arr
        {$rs = new RuleSet($NonTerm.text);}
    | NonTerm Arr single=singleRule
        {$rs = new RuleSet($NonTerm.text, $single.r);}
    | NonTerm Arr single1=singleRule Delim set=subRuleSet
        {$rs = new RuleSet($NonTerm.text, $single1.r, $set.lr);}
    ;
subRuleSet returns[ArrayList<Rule> lr]
    : oRule=singleRule
        {$lr = new ArrayList<>();}
        {$lr.add($oRule.r);}
    | oRule1=singleRule Delim other=subRuleSet
        {$lr = new ArrayList<>();}
        {$lr.add($oRule1.r);}
        {$lr.addAll($other.lr);}
    |
        {$lr = new ArrayList<>();}
        {$lr.add(new Rule());}
    | Delim other1= subRuleSet
        {$lr = new ArrayList<>();}
        {$lr.add(new Rule());}
        {$lr.addAll($other1.lr);}
    ;
singleRule returns[Rule r]
    : list=nonTerm
        {$r = new Rule($list.lit);}
    | list1=term
        {$r = new Rule($list1.lit);}
    ;
nonTerm returns[ArrayList<String> lit]
    : NonTerm list=nonTerm
        {$lit = new ArrayList<>();}
        {$lit.add($NonTerm.text);}
        {$lit.addAll($list.lit);}
    | NonTerm list1=term
        {$lit = new ArrayList<>();}
        {$lit.add($NonTerm.text);}
        {$lit.addAll($list1.lit);}
    | NonTerm
        {$lit = new ArrayList<>();}
        {$lit.add($NonTerm.text);}
    ;
term returns[ArrayList<String> lit]
    : Term list=term
        {$lit = new ArrayList<>();}
        {$lit.add($Term.text);}
        {$lit.addAll($list.lit);}
    | Term list1=nonTerm
        {$lit = new ArrayList<>();}
        {$lit.add($Term.text);}
        {$lit.addAll($list1.lit);}
    | Term
        {$lit = new ArrayList<>();}
        {$lit.add($Term.text);}
    ;
/** Tokens Description :*/
NonTerm : [a-z][A-Za-z]*;
Term : [A-Z][A-Za-z]*;
Delim : '|';
Arr : '->';
WS : [ \t\r\n]+ -> skip;
Colon : ':';
Regexp : '<' (~[<>])* '>';