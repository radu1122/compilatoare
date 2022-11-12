// Generated from /Users/radu.dum/Documents/facultate/compilatoare/labs/lab03/CPLangParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPLangParser}.
 */
public interface CPLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CPLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CPLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPLangParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CPLangParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPLangParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CPLangParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPLangParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(CPLangParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPLangParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(CPLangParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(CPLangParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(CPLangParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(CPLangParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(CPLangParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(CPLangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(CPLangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(CPLangParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(CPLangParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(CPLangParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(CPLangParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(CPLangParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(CPLangParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CPLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CPLangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlus(CPLangParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlus(CPLangParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CPLangParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CPLangParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(CPLangParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(CPLangParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CPLangParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CPLangParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CPLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CPLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(CPLangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(CPLangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CPLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CPLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CPLangParser.AssignContext ctx);
}