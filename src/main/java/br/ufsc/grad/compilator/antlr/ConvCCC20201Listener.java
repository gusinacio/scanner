// Generated from ConvCCC20201.g4 by ANTLR 4.8
package br.ufsc.grad.compilator.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConvCCC20201Parser}.
 */
public interface ConvCCC20201Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ConvCCC20201Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ConvCCC20201Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#funclist}.
	 * @param ctx the parse tree
	 */
	void enterFunclist(ConvCCC20201Parser.FunclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#funclist}.
	 * @param ctx the parse tree
	 */
	void exitFunclist(ConvCCC20201Parser.FunclistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#funclist1}.
	 * @param ctx the parse tree
	 */
	void enterFunclist1(ConvCCC20201Parser.Funclist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#funclist1}.
	 * @param ctx the parse tree
	 */
	void exitFunclist1(ConvCCC20201Parser.Funclist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(ConvCCC20201Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(ConvCCC20201Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(ConvCCC20201Parser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(ConvCCC20201Parser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#paramlist1}.
	 * @param ctx the parse tree
	 */
	void enterParamlist1(ConvCCC20201Parser.Paramlist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#paramlist1}.
	 * @param ctx the parse tree
	 */
	void exitParamlist1(ConvCCC20201Parser.Paramlist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ConvCCC20201Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ConvCCC20201Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#breakstat}.
	 * @param ctx the parse tree
	 */
	void enterBreakstat(ConvCCC20201Parser.BreakstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#breakstat}.
	 * @param ctx the parse tree
	 */
	void exitBreakstat(ConvCCC20201Parser.BreakstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#openclosestat}.
	 * @param ctx the parse tree
	 */
	void enterOpenclosestat(ConvCCC20201Parser.OpenclosestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#openclosestat}.
	 * @param ctx the parse tree
	 */
	void exitOpenclosestat(ConvCCC20201Parser.OpenclosestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(ConvCCC20201Parser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(ConvCCC20201Parser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(ConvCCC20201Parser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(ConvCCC20201Parser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#vartype}.
	 * @param ctx the parse tree
	 */
	void enterVartype(ConvCCC20201Parser.VartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#vartype}.
	 * @param ctx the parse tree
	 */
	void exitVartype(ConvCCC20201Parser.VartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(ConvCCC20201Parser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(ConvCCC20201Parser.AtribstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#atribstat1}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat1(ConvCCC20201Parser.Atribstat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#atribstat1}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat1(ConvCCC20201Parser.Atribstat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#paramlistcall}.
	 * @param ctx the parse tree
	 */
	void enterParamlistcall(ConvCCC20201Parser.ParamlistcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#paramlistcall}.
	 * @param ctx the parse tree
	 */
	void exitParamlistcall(ConvCCC20201Parser.ParamlistcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#paramlistcall1}.
	 * @param ctx the parse tree
	 */
	void enterParamlistcall1(ConvCCC20201Parser.Paramlistcall1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#paramlistcall1}.
	 * @param ctx the parse tree
	 */
	void exitParamlistcall1(ConvCCC20201Parser.Paramlistcall1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(ConvCCC20201Parser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(ConvCCC20201Parser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(ConvCCC20201Parser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(ConvCCC20201Parser.ReadstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(ConvCCC20201Parser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(ConvCCC20201Parser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(ConvCCC20201Parser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(ConvCCC20201Parser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#elsestat}.
	 * @param ctx the parse tree
	 */
	void enterElsestat(ConvCCC20201Parser.ElsestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#elsestat}.
	 * @param ctx the parse tree
	 */
	void exitElsestat(ConvCCC20201Parser.ElsestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(ConvCCC20201Parser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(ConvCCC20201Parser.ForstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#statelist}.
	 * @param ctx the parse tree
	 */
	void enterStatelist(ConvCCC20201Parser.StatelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#statelist}.
	 * @param ctx the parse tree
	 */
	void exitStatelist(ConvCCC20201Parser.StatelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#statelist1}.
	 * @param ctx the parse tree
	 */
	void enterStatelist1(ConvCCC20201Parser.Statelist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#statelist1}.
	 * @param ctx the parse tree
	 */
	void exitStatelist1(ConvCCC20201Parser.Statelist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#allocexpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocexpression(ConvCCC20201Parser.AllocexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#allocexpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocexpression(ConvCCC20201Parser.AllocexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#numexpbracket}.
	 * @param ctx the parse tree
	 */
	void enterNumexpbracket(ConvCCC20201Parser.NumexpbracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#numexpbracket}.
	 * @param ctx the parse tree
	 */
	void exitNumexpbracket(ConvCCC20201Parser.NumexpbracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ConvCCC20201Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ConvCCC20201Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(ConvCCC20201Parser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(ConvCCC20201Parser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ConvCCC20201Parser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ConvCCC20201Parser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#numexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression(ConvCCC20201Parser.NumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#numexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression(ConvCCC20201Parser.NumexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#numexpression1}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression1(ConvCCC20201Parser.Numexpression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#numexpression1}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression1(ConvCCC20201Parser.Numexpression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ConvCCC20201Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ConvCCC20201Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#term1}.
	 * @param ctx the parse tree
	 */
	void enterTerm1(ConvCCC20201Parser.Term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#term1}.
	 * @param ctx the parse tree
	 */
	void exitTerm1(ConvCCC20201Parser.Term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#minorarith}.
	 * @param ctx the parse tree
	 */
	void enterMinorarith(ConvCCC20201Parser.MinorarithContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#minorarith}.
	 * @param ctx the parse tree
	 */
	void exitMinorarith(ConvCCC20201Parser.MinorarithContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#priorarith}.
	 * @param ctx the parse tree
	 */
	void enterPriorarith(ConvCCC20201Parser.PriorarithContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#priorarith}.
	 * @param ctx the parse tree
	 */
	void exitPriorarith(ConvCCC20201Parser.PriorarithContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(ConvCCC20201Parser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(ConvCCC20201Parser.UnaryexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ConvCCC20201Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ConvCCC20201Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#factor1}.
	 * @param ctx the parse tree
	 */
	void enterFactor1(ConvCCC20201Parser.Factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#factor1}.
	 * @param ctx the parse tree
	 */
	void exitFactor1(ConvCCC20201Parser.Factor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ConvCCC20201Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(ConvCCC20201Parser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConvCCC20201Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(ConvCCC20201Parser.LvalueContext ctx);
}