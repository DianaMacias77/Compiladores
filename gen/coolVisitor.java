// Generated from C:/Users/diana/OneDrive/Documentos/Compiladores/tc3048-202213/cool/semantic3/antlr\cool.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link coolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface coolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link coolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(coolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParser#klass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKlass(coolParser.KlassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link coolParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(coolParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link coolParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(coolParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(coolParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(coolParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(coolParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(coolParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(coolParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pri}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPri(coolParser.PriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(coolParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callobj}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallobj(coolParser.CallobjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(coolParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(coolParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(coolParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(coolParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(coolParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(coolParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(coolParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(coolParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lesseq}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesseq(coolParser.LesseqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callstat}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstat(coolParser.CallstatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(coolParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(coolParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(coolParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link coolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(coolParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParser#case_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stat(coolParser.Case_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link coolParser#let_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_decl(coolParser.Let_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(coolParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(coolParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(coolParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(coolParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link coolParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(coolParser.BoolContext ctx);
}