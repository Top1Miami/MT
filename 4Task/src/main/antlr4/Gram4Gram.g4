grammar Gram4Gram;

@header {
package main.generatedLexerParser;
import main.classes4gram.*;
}
/** Rules Description :*/
begin returns [Grammar gram]
    : NonTerm COMMA {$gram = new Grammar($NonTerm.text);}
        lexerParser[$gram]
    | impL=importsList NonTerm COMMA {$gram = new Grammar($NonTerm.text, $impL.imp);}
            lexerParser[$gram]
    ;
importsList returns[ArrayList<String> imp]
    : Import Regexp
        {$imp = new ArrayList<>();}
        {$imp.add($Regexp.text);}
    | Import Regexp other=importsList
        {$imp = new ArrayList<>();}
        {$imp.add($Regexp.text);}
        {$imp.addAll($other.imp);}
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
    |
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
    | NonTerm Arr Action
        {$rs = new RuleSet($NonTerm.text,$Action.text);}
    | NonTerm Arr single=singleRule
        {$rs = new RuleSet($NonTerm.text, $single.r);}
    | NonTerm Arr single1=singleRule Delim set=subRuleSet
        {$rs = new RuleSet($NonTerm.text, $single1.r, $set.lr);}
    | NonTerm LP arg1=getArg RP Arr
        {$rs = new RuleSet($NonTerm.text);}
        {$rs.setArgs($arg1.argl);}
    | NonTerm LP argAc=getArg RP Arr Action
        {$rs = new RuleSet($NonTerm.text, $Action.text);}
        {$rs.setArgs($argAc.argl);}
    | NonTerm LP arg2=getArg RP Arr single=singleRule
        {$rs = new RuleSet($NonTerm.text, $single.r);}
        {$rs.setArgs($arg2.argl);}
    | NonTerm LP arg3=getArg RP Arr single1=singleRule Delim set=subRuleSet
        {$rs = new RuleSet($NonTerm.text, $single1.r, $set.lr);}
        {$rs.setArgs($arg3.argl);}
    | NonTerm Ret LP retarg1=getArg RP Arr
        {$rs = new RuleSet($NonTerm.text);}
        {$rs.setRetArgs($retarg1.argl);}
    | NonTerm Ret LP retargAc=getArg RP Arr Action
          {$rs = new RuleSet($NonTerm.text, $Action.text);}
          {$rs.setRetArgs($retargAc.argl);}
    | NonTerm Ret LP retarg2=getArg RP Arr single=singleRule
        {$rs = new RuleSet($NonTerm.text, $single.r);}
        {$rs.setRetArgs($retarg2.argl);}
    | NonTerm Ret LP retarg3=getArg RP Arr single1=singleRule Delim set=subRuleSet
        {$rs = new RuleSet($NonTerm.text, $single1.r, $set.lr);}
        {$rs.setRetArgs($retarg3.argl);}
    | NonTerm LP arg4=getArg RP Ret LP retarg4=getArg RP Arr
        {$rs = new RuleSet($NonTerm.text);}
        {$rs.setArgs($arg4.argl);}
        {$rs.setRetArgs($retarg4.argl);}
    | NonTerm LP argAc1=getArg RP Ret LP retargAc1=getArg RP Arr Action
        {$rs = new RuleSet($NonTerm.text, $Action.text);}
        {$rs.setArgs($argAc1.argl);}
        {$rs.setRetArgs($retargAc1.argl);}
    | NonTerm LP arg5=getArg RP Ret LP retarg5=getArg RP Arr single=singleRule
        {$rs = new RuleSet($NonTerm.text, $single.r);}
        {$rs.setArgs($arg5.argl);}
        {$rs.setRetArgs($retarg5.argl);}
    | NonTerm LP arg6=getArg RP Ret LP retarg6=getArg RP Arr single1=singleRule Delim set=subRuleSet
        {$rs = new RuleSet($NonTerm.text, $single1.r, $set.lr);}
        {$rs.setArgs($arg6.argl);}
        {$rs.setRetArgs($retarg6.argl);}
    ;
//getAction returns[String act]
//    : Action
//        {$act = new String($Action.text);}
//    ;
getArg returns[ArrayList<Argument> argl]
    : Term case2=getType NonTerm other1=getArg
        {$argl = new ArrayList<Argument>();}
        {$argl.add(new Argument($Term.text, "new class"));}
        {$argl.add(new Argument($case2.type, $NonTerm.text));}
        {$argl.addAll($other1.argl);}
    | Term case21=getType NonTerm
        {$argl = new ArrayList<>();}
        {$argl.add(new Argument($Term.text, "new class"));}
        {$argl.add(new Argument($case21.type, $NonTerm.text));}
    //in case uses initialized classes
    | t1=getType NonTerm COMMA other=getArg
        {$argl = new ArrayList<Argument>();}
        {$argl.add(new Argument($t1.type, $NonTerm.text));}
        {$argl.addAll($other.argl);}
    | t2=getType NonTerm
        {$argl = new ArrayList<Argument>();}
        {$argl.add(new Argument($t2.type, $NonTerm.text));}
    ;
getType returns[String type]
    : Term {$type = $Term.text;}
    | NonTerm {$type = $NonTerm.text;}
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
    | Action
        {$lr = new ArrayList<>();}
        {$lr.add(new Rule($Action.text));}
    | Delim other1= subRuleSet
        {$lr = new ArrayList<>();}
        {$lr.add(new Rule());}
        {$lr.addAll($other1.lr);}
    | Action Delim other2=subRuleSet
        {$lr = new ArrayList<>();}
        {$lr.add(new Rule($Action.text));}
        {$lr.addAll($other2.lr);}
    ;
singleRule returns[Rule r]
    : list=nonTerm
        {$r = new Rule($list.lit);}
    | list1=term
        {$r = new Rule($list1.lit);}
    | list2=nonTerm Action
        {$r = new Rule($list2.lit);}
        {$r.setCode($Action.text);}
    | list3=term Action
        {$r = new Rule($list3.lit);}
        {$r.setCode($Action.text);}
    ;
nonTerm returns[ArrayList<Literal> lit]
    : NonTerm LP blo=par RP list2=nonTerm
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($NonTerm.text, true, $blo.params));}
        {$lit.addAll($list2.lit);}
    | NonTerm list=nonTerm
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($NonTerm.text, true));}
        {$lit.addAll($list.lit);}
    | NonTerm list1=term
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($NonTerm.text, true));}
        {$lit.addAll($list1.lit);}
    | NonTerm LP blo1=par RP list3=term
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($NonTerm.text, true, $blo1.params));}
        {$lit.addAll($list3.lit);}
    | NonTerm
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($NonTerm.text, true));}
    | NonTerm LP blo2=par RP
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($NonTerm.text, true, $blo2.params));}
    ;
par returns [ArrayList<String> params]
    : NonTerm
        {$params = new ArrayList<>();}
        {$params.add($NonTerm.text);}
    | Term
        {$params = new ArrayList<>();}
        {$params.add($Term.text);}
    | NonTerm COMMA kal=par
        {$params = new ArrayList<>();}
        {$params.add($NonTerm.text);}
        {$params.addAll($kal.params);}
    | Term COMMA kal1=par
        {$params = new ArrayList<>();}
        {$params.add($Term.text);}
        {$params.addAll($kal1.params);}
    ;
term returns[ArrayList<Literal> lit]
    : Term list=term
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($Term.text, false));}
        {$lit.addAll($list.lit);}
    | Term list1=nonTerm
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($Term.text, false));}
        {$lit.addAll($list1.lit);}
    | Term
        {$lit = new ArrayList<>();}
        {$lit.add(new Literal($Term.text, false));}
    ;
/** Tokens Description :*/
NonTerm : [a-z][A-Za-z]*;
Term : [A-Z][A-Za-z]*;
Delim : '|';
Arr : '->';
WS : [ \t\r\n]+ -> skip;
Colon : ':';
Regexp : '<' (~[<>])* '>';
RP : ']';
LP : '[';
COMMA : ',';
Ret : '_returns';
Action : '{' (~[{}])* '}' ;
Import : '_import';
