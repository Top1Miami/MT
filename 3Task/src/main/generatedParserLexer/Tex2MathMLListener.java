// Generated from Tex2MathML.g4 by ANTLR 4.7.1

package main.generatedParserLexer;
import main.expression.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Tex2MathMLParser}.
 */
public interface Tex2MathMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(Tex2MathMLParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(Tex2MathMLParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(Tex2MathMLParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(Tex2MathMLParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(Tex2MathMLParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(Tex2MathMLParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(Tex2MathMLParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(Tex2MathMLParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(Tex2MathMLParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(Tex2MathMLParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(Tex2MathMLParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(Tex2MathMLParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tex2MathMLParser#frac}.
	 * @param ctx the parse tree
	 */
	void enterFrac(Tex2MathMLParser.FracContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tex2MathMLParser#frac}.
	 * @param ctx the parse tree
	 */
	void exitFrac(Tex2MathMLParser.FracContext ctx);
}