// Generated from C:/Users/diana/OneDrive/Documentos/Compiladores/tc3048-202213/cool/semantic3/antlr\cool.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link coolParser}.
 */
public interface coolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link coolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(coolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(coolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParser#klass}.
	 * @param ctx the parse tree
	 */
	void enterKlass(coolParser.KlassContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParser#klass}.
	 * @param ctx the parse tree
	 */
	void exitKlass(coolParser.KlassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link coolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterMethod(coolParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link coolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitMethod(coolParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link coolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(coolParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link coolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(coolParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(coolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(coolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(coolParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(coolParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(coolParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(coolParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(coolParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(coolParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(coolParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(coolParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pri}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPri(coolParser.PriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pri}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPri(coolParser.PriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(coolParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(coolParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callobj}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallobj(coolParser.CallobjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callobj}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallobj(coolParser.CallobjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code less}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLess(coolParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code less}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLess(coolParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(coolParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(coolParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq(coolParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq(coolParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(coolParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(coolParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(coolParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(coolParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence(coolParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence(coolParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(coolParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(coolParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(coolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(coolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesseq}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLesseq(coolParser.LesseqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesseq}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLesseq(coolParser.LesseqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callstat}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallstat(coolParser.CallstatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callstat}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallstat(coolParser.CallstatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(coolParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(coolParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(coolParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(coolParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(coolParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(coolParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(coolParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(coolParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParser#case_stat}.
	 * @param ctx the parse tree
	 */
	void enterCase_stat(coolParser.Case_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParser#case_stat}.
	 * @param ctx the parse tree
	 */
	void exitCase_stat(coolParser.Case_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link coolParser#let_decl}.
	 * @param ctx the parse tree
	 */
	void enterLet_decl(coolParser.Let_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link coolParser#let_decl}.
	 * @param ctx the parse tree
	 */
	void exitLet_decl(coolParser.Let_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParens(coolParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParens(coolParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterVar(coolParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitVar(coolParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterInt(coolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitInt(coolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterStr(coolParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitStr(coolParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterBool(coolParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitBool(coolParser.BoolContext ctx);
}