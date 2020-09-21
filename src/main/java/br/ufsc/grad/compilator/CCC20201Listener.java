// Generated from CCC20201.g4 by ANTLR 4.8
package br.ufsc.grad.compilator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CCC20201Parser}.
 */
public interface CCC20201Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CCC20201Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CCC20201Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#funclist}.
	 * @param ctx the parse tree
	 */
	void enterFunclist(CCC20201Parser.FunclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#funclist}.
	 * @param ctx the parse tree
	 */
	void exitFunclist(CCC20201Parser.FunclistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(CCC20201Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(CCC20201Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(CCC20201Parser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(CCC20201Parser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CCC20201Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CCC20201Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(CCC20201Parser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(CCC20201Parser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#vartype}.
	 * @param ctx the parse tree
	 */
	void enterVartype(CCC20201Parser.VartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#vartype}.
	 * @param ctx the parse tree
	 */
	void exitVartype(CCC20201Parser.VartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(CCC20201Parser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(CCC20201Parser.AtribstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(CCC20201Parser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(CCC20201Parser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#paramlistcall}.
	 * @param ctx the parse tree
	 */
	void enterParamlistcall(CCC20201Parser.ParamlistcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#paramlistcall}.
	 * @param ctx the parse tree
	 */
	void exitParamlistcall(CCC20201Parser.ParamlistcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(CCC20201Parser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(CCC20201Parser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(CCC20201Parser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(CCC20201Parser.ReadstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(CCC20201Parser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(CCC20201Parser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(CCC20201Parser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(CCC20201Parser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(CCC20201Parser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(CCC20201Parser.ForstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#statelist}.
	 * @param ctx the parse tree
	 */
	void enterStatelist(CCC20201Parser.StatelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#statelist}.
	 * @param ctx the parse tree
	 */
	void exitStatelist(CCC20201Parser.StatelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#allocexpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocexpression(CCC20201Parser.AllocexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#allocexpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocexpression(CCC20201Parser.AllocexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CCC20201Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CCC20201Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(CCC20201Parser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(CCC20201Parser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#numexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression(CCC20201Parser.NumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#numexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression(CCC20201Parser.NumexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CCC20201Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CCC20201Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#minorarith}.
	 * @param ctx the parse tree
	 */
	void enterMinorarith(CCC20201Parser.MinorarithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#minorarith}.
	 * @param ctx the parse tree
	 */
	void exitMinorarith(CCC20201Parser.MinorarithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#priorarith}.
	 * @param ctx the parse tree
	 */
	void enterPriorarith(CCC20201Parser.PriorarithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#priorarith}.
	 * @param ctx the parse tree
	 */
	void exitPriorarith(CCC20201Parser.PriorarithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(CCC20201Parser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(CCC20201Parser.UnaryexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CCC20201Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CCC20201Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCC20201Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(CCC20201Parser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCC20201Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(CCC20201Parser.LvalueContext ctx);
}