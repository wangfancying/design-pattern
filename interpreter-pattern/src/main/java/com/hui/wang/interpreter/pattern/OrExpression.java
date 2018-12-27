package com.hui.wang.interpreter.pattern;

/**
 * 代表逻辑“或”操作的Or类，
 *
 * <b>文法中的每一条规则都需要一个具体的非终结符表达式，非终结符表达式一般是文法中的运算符或者其他关键字，
 * 比如公式R=R1+R2中，“+"就是非终结符，解析“+”的解释器就是一个非终结符表达式。</b>
 *
 * @author hui.wang09
 * @since 25 December 2018
 */
public class OrExpression implements Expression{

	private Expression left;
	private Expression right;

	public OrExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Context context) {
		return left.interpret(context) || right.interpret(context);
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " OR " + right.toString() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof OrExpression) {
			return left.equals(((OrExpression)obj).left) &&
					right.equals(((OrExpression)obj).right);
		}
		return false;
	}
}
