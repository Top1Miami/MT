// Generated from Gram4Gram.g4 by ANTLR 4.7.1

package main.generatedLexerParser;
import main.classes4gram.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Gram4GramParser}.
 */
public interface Gram4GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(Gram4GramParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(Gram4GramParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#importsList}.
	 * @param ctx the parse tree
	 */
	void enterImportsList(Gram4GramParser.ImportsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#importsList}.
	 * @param ctx the parse tree
	 */
	void exitImportsList(Gram4GramParser.ImportsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#lexerParser}.
	 * @param ctx the parse tree
	 */
	void enterLexerParser(Gram4GramParser.LexerParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#lexerParser}.
	 * @param ctx the parse tree
	 */
	void exitLexerParser(Gram4GramParser.LexerParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#lexemList}.
	 * @param ctx the parse tree
	 */
	void enterLexemList(Gram4GramParser.LexemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#lexemList}.
	 * @param ctx the parse tree
	 */
	void exitLexemList(Gram4GramParser.LexemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#singleLexem}.
	 * @param ctx the parse tree
	 */
	void enterSingleLexem(Gram4GramParser.SingleLexemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#singleLexem}.
	 * @param ctx the parse tree
	 */
	void exitSingleLexem(Gram4GramParser.SingleLexemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void enterRuleList(Gram4GramParser.RuleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void exitRuleList(Gram4GramParser.RuleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(Gram4GramParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(Gram4GramParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#getArg}.
	 * @param ctx the parse tree
	 */
	void enterGetArg(Gram4GramParser.GetArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#getArg}.
	 * @param ctx the parse tree
	 */
	void exitGetArg(Gram4GramParser.GetArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#getType}.
	 * @param ctx the parse tree
	 */
	void enterGetType(Gram4GramParser.GetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#getType}.
	 * @param ctx the parse tree
	 */
	void exitGetType(Gram4GramParser.GetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#subRuleSet}.
	 * @param ctx the parse tree
	 */
	void enterSubRuleSet(Gram4GramParser.SubRuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#subRuleSet}.
	 * @param ctx the parse tree
	 */
	void exitSubRuleSet(Gram4GramParser.SubRuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#singleRule}.
	 * @param ctx the parse tree
	 */
	void enterSingleRule(Gram4GramParser.SingleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#singleRule}.
	 * @param ctx the parse tree
	 */
	void exitSingleRule(Gram4GramParser.SingleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#nonTerm}.
	 * @param ctx the parse tree
	 */
	void enterNonTerm(Gram4GramParser.NonTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#nonTerm}.
	 * @param ctx the parse tree
	 */
	void exitNonTerm(Gram4GramParser.NonTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(Gram4GramParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(Gram4GramParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gram4GramParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Gram4GramParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gram4GramParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Gram4GramParser.TermContext ctx);
}