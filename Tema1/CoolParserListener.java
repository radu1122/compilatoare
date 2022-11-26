// Generated from /Users/radu.dum/Documents/facultate/compilatoare/Tema1/src/cool/parser/CoolParser.g4 by ANTLR 4.10.1

    package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classELem}.
	 * @param ctx the parse tree
	 */
	void enterClassELem(CoolParser.ClassELemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classELem}.
	 * @param ctx the parse tree
	 */
	void exitClassELem(CoolParser.ClassELemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(CoolParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(CoolParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CoolParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CoolParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CoolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CoolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#letDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLetDefinition(CoolParser.LetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#letDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLetDefinition(CoolParser.LetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CoolParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CoolParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(CoolParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(CoolParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(CoolParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(CoolParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(CoolParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(CoolParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid_clause(CoolParser.Isvoid_clauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid_clause(CoolParser.Isvoid_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(CoolParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(CoolParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CoolParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CoolParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessthan(CoolParser.LessthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessthan(CoolParser.LessthanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassDispatch(CoolParser.ClassDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassDispatch(CoolParser.ClassDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(CoolParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(CoolParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(CoolParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(CoolParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolval}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolval(CoolParser.BoolvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolval}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolval(CoolParser.BoolvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_clause(CoolParser.While_clauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_clause(CoolParser.While_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CoolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CoolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(CoolParser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(CoolParser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr(CoolParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr(CoolParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CoolParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CoolParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logical_negation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_negation(CoolParser.Logical_negationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_negation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_negation(CoolParser.Logical_negationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nested_expr}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNested_expr(CoolParser.Nested_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nested_expr}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNested_expr(CoolParser.Nested_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesseq}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLesseq(CoolParser.LesseqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesseq}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLesseq(CoolParser.LesseqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquals(CoolParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquals(CoolParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_clause(CoolParser.If_clauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_clause}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_clause(CoolParser.If_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CoolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CoolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(CoolParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(CoolParser.InstantiationContext ctx);
}